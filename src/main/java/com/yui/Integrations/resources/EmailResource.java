package com.yui.Integrations.resources;

import com.yui.Integrations.dto.EmailDTO;
import com.yui.Integrations.services.EmailService;
import com.yui.Integrations.services.SendGridEmailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emails")
@Tag(name = "Emails", description = "Controller for Email")
public class EmailResource {

    @Autowired
    private EmailService service;

    @Operation(description = "Post a email", summary = "Post a email", responses = {
            @ApiResponse(description = "No Content", responseCode = "204"),
            @ApiResponse(description = "Bad Request", responseCode = "400")
    })
    @PostMapping(produces = "application/json")
    public ResponseEntity<Void> sendEmail(@RequestBody EmailDTO emailDTO){
        service.sendEmail(emailDTO);
        return ResponseEntity.noContent().build();
    }
}
