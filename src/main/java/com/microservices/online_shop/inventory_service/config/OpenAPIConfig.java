package com.microservices.online_shop.inventory_service.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.JavaBean;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI inventoryServiceAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Inventory Service API")
                        .description("Inventory Service API documentation")
                        .version("v1.0.0")
                        .license(new License().name("Apachae 2.0")))
                .externalDocs(new ExternalDocumentation()
                        .description("You can refer to the inventory service wiki documentation")
                        .url("https://product-service-dummy-url.com/docs"));

    }
}
