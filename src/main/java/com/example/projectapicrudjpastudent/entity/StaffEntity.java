package com.example.projectapicrudjpastudent.entity;

import javax.persistence.*;

@Entity   // java.persistence
@Table(name = "staff")
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tu dong tang ID
    @Column(name = "id_staff")
    private long idStaff;

    @Column(name = "full_name", columnDefinition = "NVARCHAR(50)")
    private String fullName;

    @Column(name = "year_born", columnDefinition = "Integer")
    private int yearBorn;

    @Column(name = "address", columnDefinition = "NVARCHAR(50)")
    private String address;

    @Column(name = "university", columnDefinition = "NVARCHAR(50)")
    private String university;

    @Column(name = "company", columnDefinition = "NVARCHAR(50)")
    private String company;

    public StaffEntity(Long idStaff, String fullName, int yearBorn, String address, String university, String company) {
        this.idStaff = idStaff;
        this.fullName = fullName;
        this.yearBorn = yearBorn;
        this.address = address;
        this.university = university;
        this.company = company;
    }

    public void setIdStaff(Long idStaff) {
        this.idStaff = idStaff;
    }

    public StaffEntity() {
    }

    public Long getIdStaff() {
        return idStaff;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
