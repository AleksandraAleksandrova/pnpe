package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            User u1 = new User("pesho", "aaabbbcccddd", "0882735444");
            User u2 = new User("goshko", "ooooddddssss", "0882425955");
            User u3 = new User("ivan", "wewewewewewe", "0883536789");

            ArrayList<User> users = new ArrayList<>();
            users.add(u1);
            users.add(u2);
            users.add(u3);

            System.out.println("Hello!\nEnter 1 for \"Sign up\" and 2 for \"Log in\":");
            Scanner sc = new Scanner(System.in);
            int answer = Integer.parseInt(sc.nextLine());
            switch(answer){
                case 1:{
                    System.out.println("You chose Sign up. Welcome!");
                    System.out.println("Enter username:");
                    String username = sc.nextLine();
                    System.out.println("Enter your password:");
                    String password1 = sc.nextLine();
                    System.out.println("Confirm your password:");
                    String password2 = sc.nextLine();
                    if(!password1.equals(password2)){
                        System.out.println("Passwords do not match. End of program.");
                        return;
                    }
                    System.out.println("Enter phone number:");
                    String phone = sc.nextLine();

                    User newUser = new User(username, password1, phone);
                    users.add(newUser);
                    System.out.println("New user added!");
                    break;
                }
                case 2:{
                    System.out.println("You chose log in.\nEnter your username:");
                    String username = sc.nextLine();
                    for (User user : users) {
                        if (username.equals(user.getUsername())) {
                            System.out.println("Enter your password:");
                            String password1 = sc.nextLine();
                            System.out.println("Confirm your password:");
                            String password2 = sc.nextLine();
                            if (!password1.equals(password2)) {
                                System.out.println("Passwords do not match. End of program.");
                                return;
                            }
                            System.out.println("Enter phone number:");
                            String phone = sc.nextLine();
                            if (password1.equals(user.getPassword()) && phone.equals(user.getPhone())) {
                                System.out.println("Log in successful.");
                                return;
                            }else{
                                System.out.println("Password or phone wrong. Cannot log you in.");
                            }
                        }
                    }
                    System.out.println("Username not found. Try signing up instead.");
                    break;
                }
                default: {
                    System.out.println("Command not available.");
                }
            }

        } catch (WrongUserException | WrongPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
    }
;}
