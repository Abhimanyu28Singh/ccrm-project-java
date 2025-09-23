package edu.ccrm.service;

import java.util.*;

import edu.ccrm.domain.Course;
import edu.ccrm.domain.Course.Builder;
import edu.ccrm.domain.Semester;
import edu.ccrm.domain.Instructor;

public class CourseService {
    private Map<String, Course> courses = new HashMap<>();

    public void menu(Scanner sc) {
        System.out.println("1. Add Course\n2. List Courses");
        int ch = Integer.parseInt(sc.nextLine());
        switch (ch) {
            case 1 -> {
                System.out.print("Enter code: "); String code = sc.nextLine();
                System.out.print("Enter title: "); String title = sc.nextLine();
                System.out.print("Enter credits: "); int cr = Integer.parseInt(sc.nextLine());
                Course c = new Builder().code(code).title(title).credits(cr).semester(Semester.FALL).department("CS").build();
                courses.put(code, c);
            }
            case 2 -> courses.values().forEach(System.out::println);
        }
    }

    public Course findByCode(String code) { return courses.get(code); }
}
