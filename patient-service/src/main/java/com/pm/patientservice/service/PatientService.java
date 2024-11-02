package com.pm.patientservice.service;

import com.pm.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    private PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }
}
