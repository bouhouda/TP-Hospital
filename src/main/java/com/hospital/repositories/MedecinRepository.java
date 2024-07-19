package com.hospital.repositories;

import com.hospital.entities.Medecin;
import com.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
}
