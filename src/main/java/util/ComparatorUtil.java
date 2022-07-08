package util;

import comparator.*;
import enums.StudentComparator;
import model.Student;
import model.University;

import java.util.Comparator;

import static enums.UniversityComparator.*;

public class ComparatorUtil {

    private ComparatorUtil() {
    }

    public static Comparator<Student> StudentComparatorMethod(StudentComparator studentComparatorEnum) {
        switch (studentComparatorEnum) {
            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            case COURSE:
                return new StudentCurrentCourseNumberComparator();
            case AVG_LEVEL:
                return new StudentAvgLevelComparator();
            default:
                return new StudentFullNameComparator();
        }
    }

    public static Comparator<University> UniversityComparatorMethod(UniversityComparator universityComparatorEnum) {
        if (FULL_NAME.equals(universityComparatorEnum)) {
            return new UniversityFullNameComparator();
        }else if (SHORT_NAME.equals(universityComparatorEnum)){
            return new UniversityShortNameComparator();
        }else if (FOUNDATION_YEAR.equals(universityComparatorEnum)){
            return new UniversityYearComparator();
        }else if (MAIN_PROFILE.equals(universityComparatorEnum)){
            return new UniversityStudyProfileComparator();
        }else if (UNIVERSITY_ID.equals(universityComparatorEnum)) {
            return new UniversityIdComparator();
        } else return null;
    }

    public static Comparator<University> UniversityComparatorMethod(enums.UniversityComparator foundationYear) {
        return new UniversityYearComparator();
    }
}
