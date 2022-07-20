package com.example.projectapicrudjpastudent.dto;

import org.springframework.stereotype.Component;

// mac dinh la component
@Component
public class StaffDTO {
    private long idStaff;
    private String company;
    private String address;
    private String university;
    private int yearBorn;

    public StaffDTO(long idStaff, String company, String address, String university, String fullName, int yearBorn) {
        this.idStaff = idStaff;
        this.company = company;
        this.address = address;
        this.university = university;
        this.fullName = fullName;
        this.yearBorn = yearBorn;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private String fullName;

    public String getUniversity() {
        return university;
    }

    public StaffDTO(long idStaff, String company, String address, String university, int yearBorn) {
        this.idStaff = idStaff;
        this.company = company;
        this.address = address;
        this.university = university;
        this.yearBorn = yearBorn;

    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }


    public void setIdStaff(long idStaff) {
        this.idStaff = idStaff;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StaffDTO() {
    }

    public Long getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(Long idStaff) {
        this.idStaff = idStaff;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
