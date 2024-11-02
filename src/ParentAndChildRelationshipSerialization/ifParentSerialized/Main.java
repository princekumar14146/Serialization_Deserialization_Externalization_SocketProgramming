package ParentAndChildRelationshipSerialization.ifParentSerialized;

import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialization

         Car car = new Car(1,"Car",101, "Audi");

        FileOutputStream fileOutputStream = new FileOutputStream("/home/bonami/aiseHi/file.ser");
        ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(car);

        objectOutputStream.flush();
        objectOutputStream.close();


       // Deserialization

        FileInputStream fileInputStream = new FileInputStream("/home/bonami/aiseHi/file.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car car1 = (Car)objectInputStream.readObject();
        System.out.println(car1);





    }
}
