package Composition_Serialization;

import java.io.*;
import java.sql.SQLOutput;

public class Main {
    /*
       In composition and aggregation there must be that you have to implements serializable interface in both the class i
       but if there is is a relationship then if parent class is serialized then class calss also gets serialized but if
       parent class is not serialized then child class can be serialized and then the parent class original value gets ignored and jvm
       read the default value of the variable


     */

    public static void main(String[] args) throws IOException, ClassNotFoundException {

         Engine engine = new Engine(1,7);
         Car car = new Car(1,"Audi", engine);

         // SERIALIZABLE

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/home/bonami/aiseHi/erf.ser"));
        objectOutputStream.writeObject(car);

         // Deserialization

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/home/bonami/aiseHi/erf.ser"));
        Car car1 = (Car)objectInputStream.readObject();
        System.out.println(car1);




    }
}
