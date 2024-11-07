package lab42;

public class PowerException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid power supply value!";
    }
}
