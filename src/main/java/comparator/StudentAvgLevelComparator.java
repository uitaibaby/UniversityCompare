package comparator;

import model.Student;

public class StudentAvgLevelComparator implements StudentComparator{
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.getAvgLevel(), o2.getAvgLevel());
    }
}
