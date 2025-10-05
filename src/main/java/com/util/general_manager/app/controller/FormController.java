package com.util.general_manager.app.controller;

import com.util.general_manager.domain.FormInput;
import com.util.general_manager.domain.dto.FormDTO;
import com.util.general_manager.domain.dto.FormSuccessfulResponseDTO;
import com.util.general_manager.domain.port.input.SaveFormInputPort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
@Tag(name = "Forms", description = "API for managing forms and scores")
public class FormController {

    private final SaveFormInputPort saveFormInputPort;

    @Operation(summary = "Submit a new form", description = "Creates a new form with associated scores")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Form successfully created")
    })
    @PostMapping("/submit-form")
    public ResponseEntity<FormSuccessfulResponseDTO> submitForm(@RequestBody FormDTO formDTO) {
        return ResponseEntity.ok(new FormSuccessfulResponseDTO(saveFormInputPort.execute(new FormInput(formDTO))));
    }
}
