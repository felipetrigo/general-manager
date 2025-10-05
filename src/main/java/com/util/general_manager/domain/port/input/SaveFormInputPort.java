package com.util.general_manager.domain.port.input;

import com.util.general_manager.domain.FormInput;

public interface SaveFormInputPort {
    String execute(FormInput input);
}
