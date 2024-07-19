package com.hospital.repositories;

import com.hospital.entities.Consultation;
import com.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
