package edu.ccrm.domain;

import java.util.ArrayList;
import java.util.List;

public class Transcript {
    private Student student;
    private List<Enrollment> enrollments = new ArrayList<>();

    public Transcript(Student s) { this.student = s; }
    public void addEnrollment(Enrollment e) { enrollments.add(e); }

    @Override
    public String toString() {
        return "Transcript for " + student.getFullName() + ":\n" + enrollments;
    }
}
