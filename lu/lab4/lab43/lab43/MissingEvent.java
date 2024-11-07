package lab43;

public class MissingEvent extends Exception {
  @Override
  public String getMessage() {
    return "Event argument is not in the events array.";
  }
}
