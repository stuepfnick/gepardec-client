package net.nu_code.gepardec_client;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppRunner {

    @Bean
    ApplicationRunner runner(App app) {
        return args -> app.run();
    }
}
