package com.lobita.refugi.repository;

import com.lobita.refugi.entity.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals, Long> {

    List<Animals> findAll();
}
