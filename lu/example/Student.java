package example;

import java.util.ArrayList;

public class Student extends User{
    private ArrayList<Grade> grades;

    public Student(String username, String password) {
        super(username, password);
        this.grades = new ArrayList<>();
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    @Override
    public UserType getUserType() {
        return UserType.STUDENT;
    }

    public void addGrade(int semester, String subject, double grade) {
        grades.add(new Grade(subject, semester, grade));
    }
}
