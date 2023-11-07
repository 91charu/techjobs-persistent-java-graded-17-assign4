package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Job extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;
//
//    private String name;
//    private String employer;
    //private String jobSkills;
@ManyToOne
@JoinColumn(name = "employer_id", referencedColumnName = "id")
private Employer employer;

@ManyToMany
@JoinTable(
        name = "job_skills",
        joinColumns = @JoinColumn(name = "job_id"),
        inverseJoinColumns = @JoinColumn(name = "skill_id")
)
private List<Skill> skills=new ArrayList<>();
    public Job() {
    }

    public Job(Employer employer, List<Skill> skills) {
        //this.jobSkills=jobSkills;
        this.skills = skills;
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
//    public Employer getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
//
//    public List<Skill> getSkills() {
//        return skills;
//    }
//
//    public void setSkills(List<Skill> skills) {
//        this.skills = skills;
//    }
//    public Job(String skills, Employer employer) {
//        this.skills = skills;
//        this.employer = employer;
//    }
//
//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }
//
//    public Employer getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
    // Initialize the id and value fields.
//    public Job(String anEmployer, String someSkills) {
//        super();
//        this.employer = anEmployer;
//        this.skills = someSkills;
//    }

//    public Job(Employer employer) {
//        this.employer = employer;
//    }
//
//    public Employer getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
//    public void setEmployer(Employer employer) {
//        this.employer = employer;
//    }
//// Getters and setters.
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmployer() {
//        return employer;
//    }
//
//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }
//
//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }


//    public void setSkills(Set<Skill> skills) {
//        this.skills = skills;
//    }
}
