package util;

import enums.StudyProfile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static enums.StudyProfile.MATHEMATICS;
import static enums.StudyProfile.PHYSICS;

public class Statistic {

    private StudyProfile mainProfile;
    private double avgLevel;
    private int studentCount, universityCount;
    private String universityName;

    public Statistic(StudyProfile mainProfile, double avgLevel, int studentCount,
                     int universityCount, String universityName) {
        this.mainProfile = mainProfile;
        this.avgLevel = avgLevel;
        this.studentCount = studentCount;
        this.universityCount = universityCount;
        this.universityName = universityName;
    }

    public static List<Statistic> createNewList() {
        List<Statistic> list = new ArrayList<Statistic>();

        Statistic first = new Statistic(PHYSICS, 2.3, 15, 1, "smth");
        Statistic second = new Statistic(MATHEMATICS, 5.0, 34, 131, "vgu");
        list.add(first);
        list.add(second);
        return list;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    public double getAvgLevel() {
        return avgLevel;
    }

    public void setAvgLevel(float avgLevel) {
        this.avgLevel = avgLevel;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getUniversityCount() {
        return universityCount;
    }

    public void setUniversityCount(int universityCount) {
        this.universityCount = universityCount;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
