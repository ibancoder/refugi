package com.lobita.refugi.repository;

import com.lobita.refugi.entity.Noticies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NoticiasRepository extends JpaRepository<Noticies, Long> {


    List<Noticies> getAllByDataNoticiaAfter(LocalDateTime fecha);
}
