package TransferOverNetwork;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    /*
       here serialVersionUid is used for object identification purpose means if the object gets serialized from
       one jvm to another jvm in another system then jvm checks before deserialization that the serialversionUid is same or not
       i.e object is coming form valid client or not if not give ClassNotFOundException

       As the object gets serialize then deserialize the hashcode is different beacuse when deserializing takes place the
       jvm created new object and that object by using Reflection api all the fields gets initialized. hence object memory is different
       hashcode is different.
     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        // serialize and send data over the network
        Employee employee = new Employee(1,"prince","Bihar");
        System.out.println("The hashcode of employee before serialization is : "+employee.hashCode());
        String host = "localhost";  // if the client and server are on the same machine if there is different machine then we have to use ip address of that machine
        int port = 1234;
        Socket socket = new Socket(host,port); // Connection endPoint use to establish connection between client and Object
        OutputStream outputStream= socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream); // convert object to byte Stream
        objectOutputStream.writeObject(employee); // send byte stream over network
        objectOutputStream.flush();




        // deserialization of Response

        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        String string =(String) objectInputStream.readObject();
        System.out.println(string);

        objectOutputStream.close();
        objectInputStream.close();

    }
}
