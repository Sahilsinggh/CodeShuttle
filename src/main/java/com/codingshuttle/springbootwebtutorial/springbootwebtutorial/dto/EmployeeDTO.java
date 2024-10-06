package com.codingshuttle.springbootwebtutorial.springbootwebtutorial.dto;

import java.time.LocalDate;
import java.util.Date;

public class EmployeeDTO {

    private Long id;
    private String name;
    private String age;
    private String email;
    private LocalDate dateOfJoining;
    private Boolean IsActive;

    public EmployeeDTO(){

    }
    public EmployeeDTO(Long id, String name, String age, String email, LocalDate dateOfJoining, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.dateOfJoining = dateOfJoining;
        IsActive = isActive;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Boolean getActive() {
        return IsActive;
    }

    public void setActive(Boolean active) {
        IsActive = active;
    }



}
