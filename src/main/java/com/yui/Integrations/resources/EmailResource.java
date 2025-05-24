package com.yui.Integrations.resources;

import com.yui.Integrations.dto.EmailDTO;
import com.yui.Integrations.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emails")
public class EmailResource {

    @Autowired
    private EmailService service;

    @PostMapping
    public ResponseEntity<Void> sendEmail(@RequestBody EmailDTO emailDTO){
        service.sendEmail(emailDTO);
        return ResponseEntity.noContent().build();
    }
}
