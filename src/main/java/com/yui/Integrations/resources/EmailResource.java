package com.yui.Integrations.resources;

import com.yui.Integrations.dto.EmailDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emails")
public class EmailResource {

    @PostMapping
    public ResponseEntity<Void> sendEmail(@RequestBody EmailDTO emailDTO){

        return ResponseEntity.noContent().build();
    }
}
