package lab9.server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        int port = 1111;
        ServerSocket serverSocket = null;
        Socket connection = null;
        Scanner socketIn = null;
        PrintWriter socketOut = null;

        try {
            serverSocket = new ServerSocket(port);

            while (true) {
                System.out.println("Server is waiting for a connection...");
                connection = serverSocket.accept();
                System.out.println("Connected client: " + connection.getInetAddress().getHostName());
                socketOut = new PrintWriter(connection.getOutputStream(), true);
                socketIn = new Scanner(new BufferedReader(new InputStreamReader(connection.getInputStream())));

                String command;
                do {
                    socketOut.flush();
                    command = socketIn.nextLine();
                    switch (command.toLowerCase()) {
                        case "hi":
                            System.out.println("Client sent command \"hi\"");
                            socketOut.println("OK");
                            break;

                        case "num":
                            System.out.println("Client sent command \"num\"");
                            socketOut.println("ok, waiting for a number");
                            String numInput = socketIn.nextLine();
                            try {
                                int number = Integer.parseInt(numInput);
                                String response = (number % 2 == 0) ? "yes" : "no";
                                socketOut.println(response);
                            } catch (NumberFormatException e) {
                                socketOut.println("Invalid number format");
                            }
                            break;

                        case "lowercase":
                            System.out.println("Client sent command \"lowercase\"");
                            socketOut.println("ok, waiting for a string");
                            String inputString = socketIn.nextLine();
                            socketOut.println(inputString.toLowerCase());
                            break;

                        case "exit":
                            System.out.println("Client sent command \"exit\"");
                            socketOut.println("OK");
                            break;

                        default:
                            System.out.println("Unknown command received");
                            socketOut.println("Unknown command");
                            break;
                    }
                } while (!command.equalsIgnoreCase("exit"));

                System.out.println("Closing connection with " + connection.getInetAddress().getHostName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socketIn != null) socketIn.close();
                if (socketOut != null) socketOut.close();
                if (connection != null) connection.close();
            } catch (IOException e) {
                System.err.println("Unable to close socket");
            }
        }
    }
}
