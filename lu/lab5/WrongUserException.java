package lab5;

public class WrongUserException extends Exception {
    @Override
    public String getMessage() {
        return "Wrong user exception!";
    }
}
