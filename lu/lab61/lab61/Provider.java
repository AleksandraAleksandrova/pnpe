package lab61;

public class Provider {
    private String name;
    private String phoneNumber;

    public Provider(String name, String phoneNumber) throws WrongPhoneNumberException {
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws WrongPhoneNumberException {
        if (!ValidatePhone.validatePhoneNumber(phoneNumber)) {
            throw new WrongPhoneNumberException();
        }
        this.phoneNumber = phoneNumber;
    }
}
