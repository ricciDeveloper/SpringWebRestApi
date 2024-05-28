package dio.SpringWebApi.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Rest API")
                        .description("Representação de API Rest com uso de Springboot e Springdoc OpenAPI")
                        .version("1.0")
                        .termsOfService("Termo de uso: open source")
                        .contact(new Contact()
                                .name("João Victor")
                                .url("http://www.site.com.br")
                                .email("joao@gmail.com"))
                        .license(new License()
                                .name("Licença do software - sua empresa")
                                .url("http://www.seusite.com.br")));
    }
}
