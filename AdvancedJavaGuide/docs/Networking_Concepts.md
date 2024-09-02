# Networking in Java

This document covers the basics of networking in Java, including how to use sockets for client-server communication.

## Sockets in Java

A socket is an endpoint for communication between two machines. Java provides the `java.net.Socket` class for client-side sockets and the `java.net.ServerSocket` class for server-side sockets.

### Client-Side Example

In the `SocketExample.java` file, the following steps are demonstrated:

1. **Create a Socket**: Establish a connection to the server.
    ```java
    Socket socket = new Socket(serverAddress, port);
    ```

2. **Send Data to the Server**: Use `PrintWriter` to send data.
    ```java
    PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
    out.println("Hello, Server!");
    ```

3. **Receive Data from the Server**: Use `BufferedReader` to read the server's response.
    ```java
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    String response = in.readLine();
    ```

4. **Close the Socket**: Always close the socket when done.
    ```java
    socket.close();
    ```

### Server-Side Example

For a server-side application, you typically:

1. **Create a ServerSocket**: Listen for incoming connections.
    ```java
    ServerSocket serverSocket = new ServerSocket(port);
    ```

2. **Accept a Connection**: Wait for a client to connect.
    ```java
    Socket clientSocket = serverSocket.accept();
    ```

3. **Communicate with the Client**: Use input and output streams to exchange data.
4. **Close the ServerSocket**: Close the server when it’s no longer needed.

### Summary

Java makes it easy to build both client and server-side networking applications using the `Socket` and `ServerSocket` classes. The `SocketExample.java` file in this project provides a basic demonstration of how to implement a simple client.


