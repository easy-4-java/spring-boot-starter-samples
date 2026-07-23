package io.github.easy4j.websocket.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import io.github.easy4j.websocket.handler.BroadcastWebSocketsHandler;
import io.github.easy4j.websocket.handler.MessageEventWebSocketHandler;
import io.github.easy4j.websocket.interceptor.HandshakeSessionInterceptor;
import io.github.easy4j.websocket.session.SessionFilter;
import io.github.easy4j.websocket.session.SessionUriPathFilter;

@Configuration
public class WebSocketConfig implements WebSocketConfigurer {

	@Autowired
	@Qualifier("dashboardWebSocketsHandler")
	private BroadcastWebSocketsHandler dashboardWebSocketsHandler;

	@Bean("dashboardSessionFilter")
	public SessionFilter dashboardSessionFilter() {
		return new SessionUriPathFilter("/metric-dashboard/**");
	}

	@Bean("dashboardWebSocketsHandler")
	public BroadcastWebSocketsHandler dashboardWebSocketsHandler(
			@Qualifier("dashboardSessionFilter") SessionFilter filter) {
		return new BroadcastWebSocketsHandler(filter);
	}

	@Autowired
	private MessageEventWebSocketHandler messageEventWebSocketHandler;
	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

		registry.addHandler(messageEventWebSocketHandler, "/metrics")
				.addInterceptors(new HandshakeSessionInterceptor()).setAllowedOrigins("*").withSockJS();

	}

}
