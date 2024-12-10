package example;

public class Teacher extends User {
    public Teacher(String username, String password) {
        super(username, password);
    }

    @Override
    public UserType getUserType() {
        return UserType.TEACHER;
    }

    public void addGrade(Student student, int semester, String subject, double grade) {
        student.addGrade(semester, subject, grade);
    }
}
