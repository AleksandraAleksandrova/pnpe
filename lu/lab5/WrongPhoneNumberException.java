package lab5;

public class WrongPhoneNumberException extends Exception {
    @Override
    public String getMessage() {
        return "Wrong phone number exception!";
    }
}
