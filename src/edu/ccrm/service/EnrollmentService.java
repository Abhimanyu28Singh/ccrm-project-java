package edu.ccrm.service;

import java.util.*;

import edu.ccrm.domain.*;

public class EnrollmentService {
    private List<Enrollment> enrollments = new ArrayList<>();

    public void menu(Scanner sc, StudentService ss, CourseService cs) {
        System.out.println("1. Enroll\n2. List Enrollments");
        int ch = Integer.parseInt(sc.nextLine());
        switch (ch) {
            case 1 -> {
                System.out.print("Student id: "); String sid = sc.nextLine();
                System.out.print("Course code: "); String code = sc.nextLine();
                Student s = ss.findById(sid);
                Course c = cs.findByCode(code);
                if (s != null && c != null) {
                    Enrollment e = new Enrollment(s, c);
                    s.enroll(c);
                    enrollments.add(e);
                }
            }
            case 2 -> enrollments.forEach(System.out::println);
        }
    }
}
