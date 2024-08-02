package com.Java.Concept_And_Coding_LLD_Playlist.Video_23_Builder_Design_Pattern;

import java.util.ArrayList;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>();
        this.subjects.add("CS");
        this.subjects.add("OS");
        return this;
    }
}
