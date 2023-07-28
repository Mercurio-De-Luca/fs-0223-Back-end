package com.epicode.repository;

import org.springframework.data.repository.CrudRepository;

import com.epicode.model.Pizza;

public interface IPizzeDAORepository extends CrudRepository<Pizza, Long> {
}
