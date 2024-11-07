package lab5;

public class User implements ValidatePhone{
    private String username;
    private String password;
    private String phone;
    private final UsernameValidator usernameValidator = new UsernameValidator();
    private final PasswordValidator passwordValidator = new PasswordValidator();

    public User(String username, String password, String phone) throws WrongUserException, WrongPhoneNumberException{
        setUsername(username);
        setPassword(password);
        setPhone(phone);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws WrongUserException{
        if(usernameValidator.isValid(username)){
            this.username = username;
        }else{
            throw new WrongUserException();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(passwordValidator.isValid(password)) {
            this.password = password;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws WrongPhoneNumberException {
        if(ValidatePhone.validatePhoneNumber(phone)){
            this.phone = phone;
        }else{
            throw new WrongPhoneNumberException();
        }
    }

}
