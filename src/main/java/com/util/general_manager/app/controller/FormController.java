package com.util.general_manager.app.controller;

import com.util.general_manager.domain.FormInput;
import com.util.general_manager.domain.dto.FormDTO;
import com.util.general_manager.domain.dto.FormSuccessfulResponseDTO;
import com.util.general_manager.domain.port.input.SaveFormInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class FormController {

    private final SaveFormInputPort port;

    @PostMapping("/submit-form")
    public ResponseEntity<FormSuccessfulResponseDTO> submitForm(@RequestBody FormDTO request) {
        String id = port.execute(new FormInput(request));
        return ResponseEntity.ok(new FormSuccessfulResponseDTO(id));
    }

}
