package enums;

import model.Student;

import java.util.Comparator;

public enum StudentComparator implements Comparator<Student> {
    FULL_NAME,
    UNIVERSITY_ID,
    COURSE,
    AVG_LEVEL;

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}
