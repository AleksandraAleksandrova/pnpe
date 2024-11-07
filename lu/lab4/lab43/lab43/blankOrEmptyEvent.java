package lab43;

public class blankOrEmptyEvent extends Exception {
    @Override
    public String getMessage() {
      return "The event given is blank or empty";
    }
}
