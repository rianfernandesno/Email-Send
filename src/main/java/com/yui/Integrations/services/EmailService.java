package com.yui.Integrations.services;

import com.yui.Integrations.dto.EmailDTO;

public interface EmailService {

    void sendEmail(EmailDTO dto);
}
