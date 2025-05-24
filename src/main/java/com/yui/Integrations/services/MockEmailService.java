package com.yui.Integrations.services;


import com.yui.Integrations.dto.EmailDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MockEmailService implements EmailService{

    private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);

    public void sendEmail(EmailDTO emailDTO){
        LOG.info("Sending email to: " + emailDTO.getTo());

    }
}
