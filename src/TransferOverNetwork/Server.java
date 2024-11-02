package TransferOverNetwork;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(1234); //used to create server on given port number
        Socket socket = serverSocket.accept(); // accept method return socket which establish the connection from server to client
        InputStream inputStream= socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Employee employee = (Employee)objectInputStream.readObject();
        System.out.println(employee);
        System.out.println("The hashCode of employee object after serialization is : "+employee.hashCode());




        // response
        String response = "I have got your message";
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(response);
        objectOutputStream.flush();
        objectOutputStream.close();

    }
}
