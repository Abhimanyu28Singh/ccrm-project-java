package edu.ccrm.domain;

public class Course {
    private String code;
    private String title;
    private int credits;
    private Instructor instructor;
    private Semester semester;
    private String department;

    private Course(Builder builder) {
        this.code = builder.code;
        this.title = builder.title;
        this.credits = builder.credits;
        this.instructor = builder.instructor;
        this.semester = builder.semester;
        this.department = builder.department;
    }

    public static class Builder {
        private String code, title, department;
        private int credits;
        private Instructor instructor;
        private Semester semester;

        public Builder code(String code) { this.code = code; return this; }
        public Builder title(String title) { this.title = title; return this; }
        public Builder credits(int credits) { this.credits = credits; return this; }
        public Builder instructor(Instructor inst) { this.instructor = inst; return this; }
        public Builder semester(Semester s) { this.semester = s; return this; }
        public Builder department(String d) { this.department = d; return this; }
        public Course build() { return new Course(this); }
    }

    @Override
    public String toString() {
        return code + " - " + title + " (" + credits + "cr, " + department + ")";
    }
}
