package lab4.lab44;

public class ZeroOrNegativeValue extends Exception{
    @Override
    public String getMessage() {
        return "Zero or negative numerical value!";
    }
}
