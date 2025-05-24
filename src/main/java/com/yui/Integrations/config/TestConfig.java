package com.yui.Integrations.config;

import com.yui.Integrations.services.EmailService;
import com.yui.Integrations.services.MockEmailService;
import com.yui.Integrations.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Bean
    public EmailService emailService(){
        return new MockEmailService();
    }

}
