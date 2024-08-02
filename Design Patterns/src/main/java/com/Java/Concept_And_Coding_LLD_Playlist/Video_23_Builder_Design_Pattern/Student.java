package com.Java.Concept_And_Coding_LLD_Playlist.Video_23_Builder_Design_Pattern;

import java.util.List;

public class Student {


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

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.rollNo = studentBuilder.rollNo;
        this.mobileNumber = studentBuilder.mobileNumber;
        this.subjects = studentBuilder.subjects;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
    }
}
