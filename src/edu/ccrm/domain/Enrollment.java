package edu.ccrm.domain;

import java.time.LocalDateTime;

public class Enrollment {
    private Student student;
    private Course course;
    private Grade grade;
    private LocalDateTime enrolledAt;

    public Enrollment(Student s, Course c) {
        this.student = s;
        this.course = c;
        this.enrolledAt = LocalDateTime.now();
    }

    public void setGrade(Grade g) { this.grade = g; }

    @Override
    public String toString() {
        return student.getFullName() + " -> " + course + " Grade: " + grade;
    }
}
