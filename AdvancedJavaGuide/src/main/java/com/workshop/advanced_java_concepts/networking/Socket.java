package com.workshop.advanced_java_concepts.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Socket {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 1234;

        try {
            // Creating a socket
            Socket socket = new Socket(serverAddress, port);

            // Sending data to the server
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            out.println("Hello, Server!");

            // Receiving data from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = in.readLine();
            System.out.println("Server Response: " + response);

            // Closing the socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

