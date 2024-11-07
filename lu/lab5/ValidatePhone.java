package lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface ValidatePhone {
    String regex = "^[0-9]{10}$";
    Pattern p = Pattern.compile(regex);

    static boolean validatePhoneNumber(String phoneNumber) {
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }
}
