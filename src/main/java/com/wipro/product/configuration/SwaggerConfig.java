package com.wipro.product.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;
@Configuration
@OpenAPIDefinition(
		info = @Info(
		        title = "Product API",
		        version = "1.0",
		        description = "API documentation for product management",
		        contact = @Contact(
		            name = "M SREEVANI",
		            url = "http://localhost:8080/v1/product",
		            email = "msc.vani@gmail.com"
		        )
		    )
		)
		
		
				
		
public class SwaggerConfig {

}
