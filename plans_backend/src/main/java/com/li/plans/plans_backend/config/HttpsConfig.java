package com.li.plans.plans_backend.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.Ssl;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class HttpsConfig {

    @Value("${server.port}")
    private int port;

    @Value("${server.ssl.key-store}")
    private String keyStorePath;

    @Value("${server.ssl.key-store-password}")
    private String keyStorePassword;

    @Value("${server.ssl.key-store-type}")
    private String keyStoreType;

    @Value("${server.ssl.key-alias}")
    private String keyAlias;

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> servletContainer() {
        return server -> {
            Ssl ssl = new Ssl();
            ssl.setKeyStore(keyStorePath);
            ssl.setKeyStorePassword(keyStorePassword);
            ssl.setKeyStoreType(keyStoreType);
            ssl.setKeyAlias(keyAlias);

            server.setPort(port);
            server.setSsl(ssl);
            server.addAdditionalTomcatConnectors(createStandardConnector());
        };
    }

    private Connector createStandardConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
        try {
            connector.setScheme("https");
            connector.setSecure(true);
            connector.setPort(port);
            protocol.setSSLEnabled(true);
            protocol.setKeystoreFile(keyStorePath);
            protocol.setKeystorePass(keyStorePassword);
            protocol.setKeyAlias(keyAlias);
            return connector;
        }
        catch (Exception ex) {
            throw new IllegalStateException("Failed to configure HTTPS connector", ex);
        }
    }
}
