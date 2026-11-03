package pf4j.plugin.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

public class CommonsIoCompatibilityTest {

    @Test
    public void resolvesFixedCommonsIoAndCopiesPluginData() throws Exception {
        assertEquals("2.14.0", IOUtils.class.getPackage().getImplementationVersion());

        byte[] pluginData = "pf4j-plugin-data-插件".getBytes(StandardCharsets.UTF_8);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        assertEquals(pluginData.length, IOUtils.copy(new ByteArrayInputStream(pluginData), output));
        assertArrayEquals(pluginData, output.toByteArray());
    }
}
