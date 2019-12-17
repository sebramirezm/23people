package com.people.workshop.schoolservice.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(max=40)
    @NotEmpty
    private String firstname;

    @Size(max=40)
    @NotEmpty
    private String lastname;

    @Min(1)
    private int age;

    @JsonBackReference
    @ManyToOne(cascade=CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name="courseid")
    private Course course;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getFirstname() {return firstname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public Course getCourse() {return course;}

    public void setCourse(Course course) {this.course = course;}

    public String getCourseName(){return course.getName();}
}
