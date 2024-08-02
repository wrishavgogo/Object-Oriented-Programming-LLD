package com.Java.Concept_And_Coding_LLD_Playlist.Video_23_Builder_Design_Pattern;

import java.util.List;

public abstract class StudentBuilder {

    /**
     * Only mandatory
     * */
    int rollNo;
    /**
     * Bottom are all optional
     * */
    String name;
    String mobileNumber;
    List<String> subjects;
    String fatherName;
    String motherName;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public StudentBuilder setSubjects() {
        this.subjects = subjects;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

}
