package StoreDataIntoFile;

import java.io.*;

public class FileStorage {
   /*
      Serialization is defined as that the mechanism to convert data into byte stream i.e we cannot store data
      into file or database directly we have to convert it into byte stream and also we cannot directly transfer data
      over the network we have to convert it into byte stream


      SO firstly we are performing converting data into byte stram and save it into file.
    */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String str="Hello world";
        int id=10;

        // serialization  -- converting Object into byte stream
        FileOutputStream fileOutputStream = new FileOutputStream("/home/bonami/aiseHi/FileStorage.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(str);
        objectOutputStream.writeInt(id);
        objectOutputStream.flush();
        objectOutputStream.close();

        // deserialization --- conevrting byte stream into object
        FileInputStream fileInputStream = new FileInputStream("/home/bonami/aiseHi/FileStorage.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println((String)objectInputStream.readObject());
        System.out.println(objectInputStream.readInt());
        objectInputStream.close();

    }
}
