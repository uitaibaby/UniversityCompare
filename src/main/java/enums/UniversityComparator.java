package enums;

import model.University;

import java.util.Comparator;

public enum UniversityComparator implements Comparator <University>{
    UNIVERSITY_ID,
    FULL_NAME,
    SHORT_NAME,
    FOUNDATION_YEAR,
    MAIN_PROFILE;

    @Override
    public int compare(University o1, University o2) {
        return 0;
    }
}
