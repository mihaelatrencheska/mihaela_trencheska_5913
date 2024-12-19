import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String fullName;
    private String yearOfStudy;
    private double id;

    public Student(String fullName, String yearOfStudy, double id) {
        this.fullName = fullName;
        this.yearOfStudy = yearOfStudy;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", id=" + id +
                '}';
    }
}
