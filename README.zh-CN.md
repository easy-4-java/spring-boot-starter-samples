<a id="readme-top"></a>

<div align="center">

# spring-boot-starter-samples

**Spring Boot Starter，集成 cxf-rt-javassist**

[![Maven Central](https://img.shields.io/maven-central/v/io.github.easy4j/spring-boot-starter-samples)](https://github.com/easy-4-java/spring-boot-starter-samples)
[![Java](https://img.shields.io/badge/Java-17-orange)](#3-运行要求与兼容性)
[![License](https://img.shields.io/badge/license-Apache-2.0-green)](https://www.apache.org/licenses/LICENSE-2.0)

[English](./README.md) | [简体中文](./README.zh-CN.md)

[项目定位](#1-项目定位) · [核心能力](#2-核心能力) ·
[引入依赖](#5-引入依赖) · [快速开始](#6-快速开始) ·
[配置参考](#7-配置参考) · [版本线](#8-版本线与兼容性) ·
[构建测试](#9-构建与测试) · [许可证](#12-许可证)

</div>

---

> **当前版本**：`1.0.0-SNAPSHOT`<br>
> **JDK 基线**：`17`<br>
> **Group ID**：`io.github.easy4j`<br>
> **Artifact ID**：`spring-boot-starter-samples`<br>
> **许可证**：Apache License 2.0<br>

## 1. 项目定位

**spring-boot-starter-samples** 是一个面向 使用 cxf-rt-javassist 的应用 的 Spring Boot Starter，用于将 **cxf-rt-javassist** 集成到 Spring Boot 应用中。它提供自动装配、属性绑定与开箱即用的 Bean，使应用以最小配置即可使用 cxf-rt-javassist 的全部能力。

| 维度 | 说明 |
|---|---|
| 类型 | Spring Boot Starter |
| 消费方 | 使用 cxf-rt-javassist 的 Spring Boot 应用 |
| 核心能力 | 自动装配、属性绑定、开箱即用的 cxf-rt-javassist Bean |
| JDK | `17` |
| 坐标 | `io.github.easy4j:spring-boot-starter-samples:1.0.0-SNAPSHOT` |
| 配置前缀 | `spring.boot.samples` |

## 2. 核心能力

| 能力 | 状态 | 说明 |
|---|:---:|---|
| 自动装配 | ✅ 稳定 | 自动注册 cxf-rt-javassist 相关 Bean |
| 属性绑定 | ✅ 稳定 | 绑定 `spring.boot.samples.*` 到 `Properties` |
| 开箱即用的 Bean | ✅ 稳定 | 通过 自动装配 自动注册 |

## 3. 运行要求与兼容性

| 依赖 | 最低版本 | 证据来源 |
|---|---:|---|
| JDK | `17` | `pom.xml` |
| Spring Boot | `3.3.3` | `pom.xml` parent |
| Maven | `3.6+` | Maven Enforcer |

## 4. 自动装配

Starter 自动装配以下 Bean：

| Bean | 条件 | 缺失时行为 |
|---|---|---|
| `Object` | classpath + property | 不创建 |

自动装配注册：

- `META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports`（Spring Boot 2.7+ / 3.x / 4.x）
- `META-INF/spring.factories`（Spring Boot 2.x 传统方式）

## 5. 引入依赖

```xml
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>spring-boot-starter-samples</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

本 Starter 依赖以下组件（版本由 ddd4j BOM 统一管理）：

```xml
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>cxf-rt-javassist</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>docx4j-template-bom</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>dozer-extra-converters</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>druid-metrics-prometheus</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>disruptor-biz</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>httputils</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>httpconn</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>hitool-core</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>hitool-crypto</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>hitool-mail</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>javassist-plus</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>jwt-issuer-api</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>jwt-issuer-with-jjwt</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>jwt-issuer-with-nimbus</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>mybatis-biz</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>mybatis-dbperms</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>okhttp3-metrics-prometheus</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>pac4j-oauth-ext</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>scribejava-apis-ext</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-biz</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-j2cache</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-pf4j</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>soapui-template</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>spring-biz</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>spring-bytebuddy</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>spring-javassist</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>undertow-metrics-prometheus</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>agora-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>aliyun-ons-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>aliyun-oss-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>aliyun-mps-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>arcface-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>axis-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>axis2-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>axis2-client-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>baiduapi-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>canal-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>curator-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>disruptor-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>dingtalk-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>docx4j-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>dropwizard-metrics-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>druid-plus-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>fastxls-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>fastdfs-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>flyway-plus-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>geoip-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>hikaricp-plus-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>httl-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>ip2region-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>ishumei-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>jcaptcha-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>jpush-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>kaptcha-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>log4j2-plus-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>maven-client-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>maven-embedder-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>maven-invoker-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>minio-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>okhttp3-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>pac4j-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>pf4j-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>pf4j2-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>pf4j3-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>playwright-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>qqwry-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>redistpl-plus-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>redisson-plus-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>schemacrawler-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-biz-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-cas-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-dingtalk-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-facebook-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-google-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-jwt-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-line-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-pac4j-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-qrcode-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>security-weixin-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-biz-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-cas-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-csrfguard-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-dingtalk-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-jwt-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-kisso-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-pac4j-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shiro-weixin-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>soapui-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>socketio-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>shanyan-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>sigar-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>simplecaptcha-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>smartcaptcha-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>tencentapi-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>webflux-swagger2-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>webmvc-swagger2-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>validation-mimetypes-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>xmemcached-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>xxljob-spring-boot-starter</artifactId>
</dependency>
<dependency>
    <groupId>io.github.easy4j</groupId>
    <artifactId>zxing-spring-boot-starter</artifactId>
</dependency>
```

## 6. 快速开始

### 6.1 引入依赖

在 `pom.xml` 中添加上述依赖。

### 6.2 配置

```yaml
spring.boot.samples:
  enabled: true
```

### 6.3 使用 Bean

```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

在业务代码中注入自动装配的 Bean：

```java
@Autowired
private Object bean;
```

## 7. 配置参考

### 7.1 配置前缀

`spring.boot.samples`

### 7.2 配置项

| 属性 | 类型 | 默认值 | 必填 | 说明 | 敏感 |
|---|---|---|:---:|---|:---:|
| `spring.boot.samples.enabled` | boolean | `true` | 否 | 是否启用 Starter | 否 |
<!-- 更多属性见下方 -->

## 8. 版本线与兼容性

| 分支 | JDK | Spring Boot | 组件版本 | 状态 |
|---|---:|---:|---|:---:|
| `2.3.x` / `2.7.x` | `8+` | 2.3.x / 2.7.x | `1.0.x` | 维护中 |
| `3.0.x` ~ `3.5.x` | `17` | 3.x | `2.0.x` | 维护中 |
| `4.0.x` / `4.1.x` | `17+` | 4.x | `3.0.x` | 活跃开发 |

## 9. 构建与测试

```bash
mvn clean verify
mvn -pl spring-boot-starter-samples -am test
```

## 10. 排障

| 症状 | 诊断 | 解决 |
|---|---|---|
| Bean 未创建 | 查看自动装配报告 | 确认 `spring.boot.samples.enabled=true` 与 classpath |
| `ClassNotFoundException` | 缺少依赖 | 引入对应模块 |
| 版本冲突 | `mvn dependency:tree` | 使用 BOM 统一版本 |

## 11. 贡献

1. Fork 本仓库。
2. 创建特性分支。
3. 提交前运行 `mvn clean verify`。
4. 提交 Pull Request。

## 12. 许可证

本项目采用 [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0) 许可证。

---

<div align="center">

[返回顶部](#readme-top) · [问题反馈](https://github.com/easy-4-java/spring-boot-starter-samples/issues) · [仓库地址](https://github.com/easy-4-java/spring-boot-starter-samples)

</div>
