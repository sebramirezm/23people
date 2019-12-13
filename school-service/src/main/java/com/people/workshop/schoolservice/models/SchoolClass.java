package com.people.workshop.schoolservice.models;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Classes")
public class SchoolClass {

    private int classid;
    private String classname;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getClassid() {return classid;}

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
