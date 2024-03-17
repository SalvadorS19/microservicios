package com.example.microg2.repository;

import com.example.microg2.models.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Long> {
}
