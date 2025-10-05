package com.util.general_manager.infra.gateway;

import com.util.general_manager.domain.entities.Form;
import com.util.general_manager.domain.entities.Score;
import com.util.general_manager.domain.port.output.SaveFormOutputPort;
import com.util.general_manager.infra.repository.FormRepository;
import com.util.general_manager.infra.repository.ScoreRepository;
import com.util.general_manager.shared.LogAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SaveFormGateway implements SaveFormOutputPort {

    private final FormRepository repository;
    private final ScoreRepository scoreRepository;
    private final LogAdapter log;

    public String saveFormGateway(Form form){
        log.info("saving form"+form.toString());
        var response = repository.save(form);
        log.info("saved form"+response);
        log.info("saving scores"+form.getScores());
        var scores = scoreRepository.saveAll(form.getScores());
        log.info("saved scores"+scores);
        return response.getId();
    }

}
