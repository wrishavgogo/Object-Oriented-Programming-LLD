package com.Java.Concept_And_Coding_LLD_Playlist.Video_23_Builder_Design_Pattern;

import java.util.ArrayList;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        this.subjects = new ArrayList<>();
        this.subjects.add("Time-Management");
        this.subjects.add("Presentation");
        return this;
    }
}
