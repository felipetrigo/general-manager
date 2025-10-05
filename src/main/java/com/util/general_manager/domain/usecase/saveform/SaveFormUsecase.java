package com.util.general_manager.domain.usecase.saveform;

import com.util.general_manager.domain.FormInput;
import com.util.general_manager.domain.entities.Form;
import com.util.general_manager.domain.mapper.FormMapper;
import com.util.general_manager.domain.port.input.SaveFormInputPort;
import com.util.general_manager.domain.port.output.SaveFormOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaveFormUsecase implements SaveFormInputPort {

    private final SaveFormOutputPort port;
    private final FormMapper mapper;

    public String execute(FormInput input) {
        Form form = mapper.toForm(input.requestData());
        form.getScores().forEach(score -> score.setForm(form));
        return port.saveFormGateway(form);
    }
}
