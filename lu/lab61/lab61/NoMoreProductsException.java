package lab61;

public class NoMoreProductsException extends RuntimeException {
    @Override
    public String getMessage() {
        return "No more products!";
    }
}
