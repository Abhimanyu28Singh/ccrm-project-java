package edu.ccrm.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private String regNo;
    private boolean active;
    private LocalDateTime createdAt;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String id, String regNo, String fullName, String email) {
        super(id, fullName, email);
        this.regNo = regNo;
        this.active = true;
        this.createdAt = LocalDateTime.now();
    }

    public void enroll(Course c) { enrolledCourses.add(c); }
    public void unenroll(Course c) { enrolledCourses.remove(c); }

    @Override
    public String profile() {
        return "Student[" + regNo + " - " + fullName + ", Active=" + active + "]";
    }

    public List<Course> getEnrolledCourses() { return enrolledCourses; }
}
