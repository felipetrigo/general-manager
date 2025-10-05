package com.util.general_manager.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "tb_score")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "form")
public class Score {
    @Id
    private String id;
    private String category;
    private String description;
    private Double totalScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "form_id", referencedColumnName = "id")
    @JsonIgnore
    private Form form;
}
