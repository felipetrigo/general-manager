package com.util.general_manager.infra.repository;

import com.util.general_manager.domain.entities.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form,String> {
}
