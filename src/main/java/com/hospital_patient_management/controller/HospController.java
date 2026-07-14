package com.hospital_patient_management.controller;


import com.hospital_patient_management.model.Hospital;
import com.hospital_patient_management.repository.HospRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospController {

    @Autowired
    public HospRepository hospRepository;

    @PostMapping
    public Hospital updateHospital(@RequestBody Hospital hospital) {
        return hospRepository.save(hospital);
    }

    @GetMapping
    public List<Hospital> findAllPatient() {
        return hospRepository.findAll();
    }

    @GetMapping("/id/{id}")
    public Hospital getPatientById(@PathVariable Long id) {
        return hospRepository.findById(id).orElse(null);
    }

    @GetMapping("/patientName/{patientName}")
    public List<Hospital> getPatientByName(@PathVariable String patientName) {
    return hospRepository.findBypatientName(patientName);
    }

    @GetMapping("/patientAge/{patientAge}")
    public List<Hospital> getPatientByAge(@PathVariable String patientAge) {
        return hospRepository.findBypatientAge(patientAge);
    }

    @GetMapping("/disease/{disease}")
    public List<Hospital> getPatientByDisease(@PathVariable String patientDisease) {
        return hospRepository.findBypatientDisease(patientDisease);
    }

    @GetMapping("/doctorName/{doctorName}")
    public List<Hospital> getPatientByDoctorName(@PathVariable String doctorName) {
        return hospRepository.findBydoctorName(doctorName);
    }

    @PutMapping("/id/{id}")
    public Hospital updateHospital(@PathVariable Long id, @RequestBody Hospital updatedHospital) {
        updatedHospital.setId(id);
        return hospRepository.save(updatedHospital);
    }

    @DeleteMapping("/id/{id}")
    public void deleteHospital(@PathVariable Long id) {
        hospRepository.deleteById(id);
    }


}
