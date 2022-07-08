package model;

public class Student {

    private String fullName;
    private String universityId;
    private int currentCourseNumber;
    private float avgLevel;

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getUniversityId() {
        return universityId;
    }

    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public Student setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
        return this;
    }

    public float getAvgLevel() {
        return avgLevel;
    }

    public Student setAvgLevel(float avgLevel) {
        this.avgLevel = avgLevel;
        return this;
    }

    @Override
    public String toString() {
        return String.format("fullName = %s, universityId = %s, currentCourseNumber = %s, avgLevel = %s",
                this.fullName,
                this.universityId,
                this.currentCourseNumber,
                this.avgLevel);
    }
}
