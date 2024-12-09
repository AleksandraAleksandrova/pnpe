package lab9.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket connection = null;
        Scanner socketIn = null;
        PrintWriter socketOut = null;
        Scanner keyboardIn = new Scanner(System.in);
        int port = 1111;
        String host = "localhost";

        try {
            System.out.println("Attempting to connect to the server...");
            try {
                connection = new Socket(host, port);
            } catch (ConnectException e) {
                System.err.println("Unable to connect to the server");
                return;
            }
            System.out.println("Connected to the server!");

            socketIn = new Scanner(new BufferedReader(new InputStreamReader(connection.getInputStream())));
            socketOut = new PrintWriter(connection.getOutputStream(), true);

            String command;
            do {
                socketOut.flush();
                System.out.print("Enter command: ");
                command = keyboardIn.nextLine();
                socketOut.println(command);

                System.out.println("Waiting for server response...");
                String serverResponse = socketIn.nextLine();
                System.out.println("Server: " + serverResponse);

                if (command.equalsIgnoreCase("num")) {
                    if (serverResponse.equalsIgnoreCase("ok, waiting for a number")) {
                        System.out.print("Enter a number: ");
                        String number = keyboardIn.nextLine();
                        socketOut.println(number);

                        System.out.println("Waiting for server response...");
                        String numResponse = socketIn.nextLine();
                        System.out.println("Server: " + numResponse);
                    }
                } else if (command.equalsIgnoreCase("lowercase")) {
                    if (serverResponse.equalsIgnoreCase("ok, waiting for a string")) {
                        System.out.print("Enter a string: ");
                        String inputString = keyboardIn.nextLine();
                        socketOut.println(inputString);

                        System.out.println("Waiting for server response...");
                        String stringResponse = socketIn.nextLine();
                        System.out.println("Server: " + stringResponse);
                    }
                }
            } while (!command.equalsIgnoreCase("exit"));
            System.out.println("Closing connection...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socketIn != null) socketIn.close();
                if (socketOut != null) socketOut.close();
                if (connection != null) connection.close();
                keyboardIn.close();
            } catch (IOException e) {
                System.err.println("Unable to close socket");
            }
        }
    }
}

