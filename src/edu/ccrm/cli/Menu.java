package edu.ccrm.cli;

import edu.ccrm.service.CourseService;
import edu.ccrm.service.EnrollmentService;
import edu.ccrm.service.StudentService;
import edu.ccrm.service.TranscriptService;
import java.util.Scanner;

public class Menu {
    private final Scanner sc = new Scanner(System.in);
    private final StudentService studentService = new StudentService();
    private final CourseService courseService = new CourseService();
    private final EnrollmentService enrollmentService = new EnrollmentService();
    private final TranscriptService transcriptService = new TranscriptService();

    public void start() {
        while (true) {
            System.out.println("\n===========================================");
            System.out.println("\n     Campus Course & Records Manager");
            System.out.println("\n===========================================");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Enrollment");
            System.out.println("4. Grades/Transcripts");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> studentService.menu(sc);
                case 2 -> courseService.menu(sc);
                case 3 -> enrollmentService.menu(sc, studentService, courseService);
                case 4 -> transcriptService.menu(sc, studentService);
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
