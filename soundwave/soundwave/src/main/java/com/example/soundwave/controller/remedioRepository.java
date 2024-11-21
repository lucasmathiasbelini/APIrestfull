package com.example.soundwave.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface remedioRepository extends JpaRepository<Remedio, Long> {


}
