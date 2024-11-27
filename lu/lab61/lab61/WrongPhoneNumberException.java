package lab61;

public class WrongPhoneNumberException extends RuntimeException {
    @Override
    public String getMessage() {
            return "Wrong phone number!";
    }
}
