package example;

import java.util.regex.Pattern;

public class Validator {
    private static final Pattern STUDENT_USERNAME_PATTERN = Pattern.compile("\\d{9}");
    private static final Pattern STUDENT_PASSWORD_PATTERN = Pattern.compile("\\d{10}");
    private static final Pattern TEACHER_USERNAME_PATTERN = Pattern.compile("[a-z]+@tu-sofia\\.bg");
    private static final Pattern TEACHER_PASSWORD_PATTERN = Pattern.compile(".{5,}");

    public static boolean validateStudent(String username, String password) {
        return STUDENT_USERNAME_PATTERN.matcher(username).matches() &&
                STUDENT_PASSWORD_PATTERN.matcher(password).matches();
    }

    public static boolean validateTeacher(String username, String password) {
        return TEACHER_USERNAME_PATTERN.matcher(username).matches() &&
                TEACHER_PASSWORD_PATTERN.matcher(password).matches();
    }
}
