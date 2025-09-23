package edu.ccrm.service;

import java.util.*;

import edu.ccrm.domain.Student;

public class StudentService {
    private Map<String, Student> students = new HashMap<>();

    public void menu(Scanner sc) {
        System.out.println("1. Add Student\n2. List Students");
        int ch = Integer.parseInt(sc.nextLine());
        switch (ch) {
            case 1 -> {
                System.out.print("Enter id: "); String id = sc.nextLine();
                System.out.print("Enter regNo: "); String reg = sc.nextLine();
                System.out.print("Enter name: "); String name = sc.nextLine();
                System.out.print("Enter email: "); String email = sc.nextLine();
                students.put(id, new Student(id, reg, name, email));
            }
            case 2 -> students.values().forEach(s -> System.out.println(s.profile()));
        }
    }

    public Student findById(String id) { return students.get(id); }
}
