package com.hospital_patient_management.model;

import jakarta.persistence.*;

@Entity
@Table(name="hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String patientName;
    private String patientAge;
    private String patientDisease;
    private String doctorName;

    public Hospital() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Hospital(Long id, String patientName, String patientAge, String patientDisease, String doctorName) {
        this.id = id;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientDisease = patientDisease;
        this.doctorName = doctorName;
    }


}
