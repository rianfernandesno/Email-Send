package com.yui.Integrations.config;

import com.yui.Integrations.services.EmailService;
import com.yui.Integrations.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public EmailService emailService(){
        return new SendGridEmailService();
    }

}
