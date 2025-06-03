package com.arsh.hrms.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Dept")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false ,length = 100)
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "department",  cascade =  CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Employee> employees;

    public Department() {
    }
    public Department(Long id,String name) {
        this.id = id;
        this.name = name;
    }

    public Department(Long id,String name,List<Employee> employees) {
        this.name = name;
        this.id = id;
        this.employees = employees;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
