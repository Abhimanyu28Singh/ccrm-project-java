package edu.ccrm.util;

import java.util.Comparator;
import edu.ccrm.domain.Student;

public class Comparators {
    public static Comparator<Student> byName = (a, b) -> a.getFullName().compareTo(b.getFullName());
}
