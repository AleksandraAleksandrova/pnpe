package lab41;

public class BlankOrEmptyString extends Exception {
    @Override
    public String getMessage() {
        return "Blank or empty String value!";
    }
}

