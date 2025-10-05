package com.util.general_manager.domain.mapper;

import com.util.general_manager.domain.dto.FormDTO;
import com.util.general_manager.domain.dto.ScoreDTO;
import com.util.general_manager.domain.entities.Form;
import com.util.general_manager.domain.entities.Score;
import org.mapstruct.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = {UUID.class})
public interface FormMapper {

    @Mapping(target = "id", expression = "java(UUID.randomUUID().toString())")
    @Mapping(target = "scores", ignore = true)
    Form toForm(FormDTO dto);

    @Mapping(target = "id", expression = "java(UUID.randomUUID().toString())")
    Score toScore(ScoreDTO dto, @Context Form form);

    default List<Score> toScoreList(List<ScoreDTO> dtoList, @Context Form form) {
        if (dtoList == null) {
            return null;
        }
        List<Score> scores = new ArrayList<>();
        for (ScoreDTO scoreDTO : dtoList) {
            Score score = toScore(scoreDTO, form);
            scores.add(score);
        }
        form.setScores(scores);
        return scores;
    }

    @AfterMapping
    default void afterMapping(@MappingTarget Form form, FormDTO dto) {
        form.setScores(toScoreList(dto.getScores(), form));
    }
}
