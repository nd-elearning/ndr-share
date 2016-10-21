package com.nd.elearning.tool.ndr.share;

import com.nd.gaea.waf.config.GaeaApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * Created by way on 2016/10/17.
 */
//@SpringBootApplication
//@Configuration
//@ComponentScan("com")
public class Application extends GaeaApplication implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
//        configurableEmbeddedServletContainer.setPort(SocketUtils.findAvailableTcpPort());
        configurableEmbeddedServletContainer.setPort(9999);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
