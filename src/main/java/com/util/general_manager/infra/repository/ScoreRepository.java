package com.util.general_manager.infra.repository;

import com.util.general_manager.domain.entities.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score,String> {
}
