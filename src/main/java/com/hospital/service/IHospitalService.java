package com.hospital.service;

import com.hospital.entities.Consultation;
import com.hospital.entities.Medecin;
import com.hospital.entities.Patient;
import com.hospital.entities.RendezVous;

public interface IHospitalService {

    Patient savePatient(Patient p);
    Medecin saveMedecin(Medecin m);
    RendezVous saveRendezVous(RendezVous r);
    Consultation saveConsultation(Consultation c);
}
