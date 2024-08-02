package com.Java.Concept_And_Coding_LLD_Playlist.Video_23_Builder_Design_Pattern;

public class Director {

    public static void main(String[] args) {

        EngineeringStudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder();
        Student engineeringStudent = engineeringStudentBuilder.setRollNo(1).setName("A").
                setSubjects().build();

        MBAStudentBuilder mbaStudentBuilder = new MBAStudentBuilder();
        Student mbaStudent = mbaStudentBuilder.setRollNo(2).setName("B").
                setFatherName("b's father").setSubjects().build();

        System.out.println(engineeringStudent.subjects);
        System.out.println(mbaStudent.subjects);
    }
}
