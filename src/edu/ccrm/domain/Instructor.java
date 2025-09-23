package edu.ccrm.domain;

public class Instructor extends Person {
    private String department;

    public Instructor(String id, String fullName, String email, String dept) {
        super(id, fullName, email);
        this.department = dept;
    }

    @Override
    public String profile() {
        return "Instructor[" + fullName + ", " + department + "]";
    }
}
