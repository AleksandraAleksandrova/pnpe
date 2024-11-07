package lab42;

public class PriceException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid price value!";
    }
}
