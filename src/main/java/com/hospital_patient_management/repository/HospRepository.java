package com.hospital_patient_management.repository;

import com.hospital_patient_management.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HospRepository extends JpaRepository<Hospital,Long> {

    List<Hospital> findBypatientName(String patientName);

    List<Hospital> findBypatientDisease(String patientDisease);

    List<Hospital> findBypatientAge(String patientAge);

    List<Hospital> findBydoctorName(String doctorName);
}
