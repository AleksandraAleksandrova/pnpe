package lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-z0-9_-]{3,15}$");

    public boolean isValid(String username) {
        if (username == null) {
            return false;
        }
        Matcher matcher = USERNAME_PATTERN.matcher(username);
        return matcher.matches();
    }
}