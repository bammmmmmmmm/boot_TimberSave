package com.richard.data_repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.richard.model.Case_;


@Repository
public interface CaseRepository extends JpaRepository<Case_, Long> {

}
