package com.util.general_manager.domain.port.output;

import com.util.general_manager.domain.entities.Form;

public interface SaveFormOutputPort {
    String saveFormGateway(Form form);
}
