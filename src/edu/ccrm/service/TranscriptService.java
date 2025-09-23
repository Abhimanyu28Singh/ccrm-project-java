package edu.ccrm.service;

import java.util.Scanner;
import edu.ccrm.domain.Student;
import edu.ccrm.domain.Transcript;

public class TranscriptService {
    public void menu(Scanner sc, StudentService ss) {
        System.out.print("Enter student id for transcript: ");
        String sid = sc.nextLine();
        Student s = ss.findById(sid);
        if (s != null) {
            Transcript t = new Transcript(s);
            System.out.println(t);
        }
    }
}
