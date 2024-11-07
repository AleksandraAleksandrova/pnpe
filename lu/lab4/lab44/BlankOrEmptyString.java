package lab44;

public class BlankOrEmptyString extends Exception {
    @Override
    public String getMessage() {
        return "Blank or empty String value!";
    }
}
