import comparator.UniversityYearComparator;
import enums.StudentComparator;
import enums.UniversityComparator;
import io.XLSReader;
import model.Student;
import model.University;
import util.ComparatorUtil;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException {

        List<Student> studentList = XLSReader.readXLSStudents("C:\\Users\\Hatch\\University\\src\\main" +
                "\\resources\\universityInfo.xlsx");
        List<University> universityList = XLSReader.readXLSUniversities("C:\\Users\\Hatch\\University\\src\\main" +
                "\\resources\\universityInfo.xlsx");
        Comparator<Student> avgComparator = ComparatorUtil.StudentComparatorMethod(StudentComparator.AVG_LEVEL);
        List<Student> newList = studentList.stream().sorted(avgComparator).toList();
        newList.forEach(System.out::println);

        Comparator<University> yearComparator = ComparatorUtil.UniversityComparatorMethod
                (UniversityComparator.FOUNDATION_YEAR);
        universityList.stream()
                .sorted(yearComparator)
                .forEach(System.out::println);
    }
}
