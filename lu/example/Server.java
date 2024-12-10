package example;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {
    private static List<User> users = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        try {
            users = UserManager.loadUsers();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No users found. Creating new users...");
            users.add(new Student("student", "student"));
            users.add(new Teacher("teacher", "teacher"));
            users.add(new Admin("admin", "admin"));
        }

        try{
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server started on port 8080...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ClientHandler(clientSocket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler implements Runnable{
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run(){
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                String username = (String) ois.readObject();
                String password = (String) ois.readObject();

                User user = null;
                for (User u : users) {
                    if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                        user = u;
                        break;
                    }
                }

                if(user == null){
                    oos.writeObject("Invalid username or password");

                } else if(user.getUserType() == UserType.ADMIN){
                    oos.writeObject("Welcome admin " + user.getUsername());
                    oos.flush();

                    oos.writeObject("Enter the user type: ");
                    oos.flush();
                    UserType userType = (UserType) ois.readObject();

                    oos.writeObject("Enter the username: ");
                    oos.flush();
                    String newUsername = (String) ois.readObject();

                    oos.writeObject("Enter the password: ");
                    oos.flush();
                    String newPassword = (String) ois.readObject();

                    switch (userType){
                        case ADMIN:
                            users.add(new Admin(newUsername, newPassword));
                            break;
                        case STUDENT:
                            if(Validator.validateStudent(newUsername, newPassword)){
                                users.add(new Student(newUsername, newPassword));
                            } else {
                                oos.writeObject("Invalid username or password");
                                oos.flush();
                            }
                            break;

                        case TEACHER:
                            if(Validator.validateTeacher(newUsername, newPassword)){
                                users.add(new Teacher(newUsername, newPassword));
                            } else {
                                oos.writeObject("Invalid username or password");
                            }
                            break;
                        default:
                            oos.writeObject("Unknown user type");
                    }

                    try {
                        UserManager.saveUsers(users);
                        oos.writeObject("User saved successfully.");
                    } catch (IOException e) {
                        oos.writeObject("Error saving users: " + e.getMessage());
                        e.printStackTrace();
                    }
                    oos.flush();
                } else if(user.getUserType() == UserType.STUDENT) {
                    oos.writeObject("Welcome student " + user.getUsername());
                    Student student = (Student) user;
                    List<Grade> grades = student.getGrades();
                    grades.sort(Comparator.comparing(Grade::getSemester).thenComparing(Grade::getSubject));
                    oos.writeObject("Grades: ");
                    oos.writeObject(grades);
                } else if(user.getUserType() == UserType.TEACHER) {
                    oos.writeObject("Welcome teacher " + user.getUsername());
                    Teacher teacher = (Teacher) user;
                    oos.writeObject("Enter the student username: ");
                    String studentUsername = (String) ois.readObject();
                    Student student = null;
                    for (User u : users) {
                        if (u.getUsername().equals(studentUsername) && u.getUserType() == UserType.STUDENT) {
                            student = (Student) u;
                            break;
                        }
                    }
                    if(student == null){
                        oos.writeObject("Student not found");
                    } else {
                        oos.writeObject("Enter the semester: ");
                        int semester = (int) ois.readObject();
                        oos.writeObject("Enter the course name: ");
                        String subject = (String) ois.readObject();
                        oos.writeObject("Enter the grade: ");
                        double grade = (double) ois.readObject();
                        teacher.addGrade(student, semester, subject, grade);
                        try {
                            UserManager.saveUsers(users);
                            oos.writeObject("Grade saved successfully.");
                        } catch (IOException e) {
                            oos.writeObject("Error saving users: " + e.getMessage());
                            e.printStackTrace();
                        }
                        oos.flush();
                    }
                } else {
                    oos.writeObject("Unknown user type");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
