package com.util.general_manager.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_form")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Form {

    @Id
    private String id;
    private String name;
    private Boolean processed = Boolean.FALSE;
    @OneToMany(mappedBy = "form", cascade = CascadeType.ALL)
    private List<Score> scores = new ArrayList<>();

}
