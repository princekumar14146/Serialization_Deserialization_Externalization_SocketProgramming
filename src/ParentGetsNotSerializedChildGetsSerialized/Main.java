package ParentGetsNotSerializedChildGetsSerialized;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

         Car car = new Car();
         car.setCarId(101);
         car.setCarName("Audi");
         car.setVehicleId(1);
         car.setVehicleName("Car");


      // Serizlizable


        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("/home/bonami/aiseHi/def.ser"));
        objectOutputStream.writeObject(car);


       // deserializable


        ObjectInputStream objectInputStream  = new ObjectInputStream(new FileInputStream("/home/bonami/aiseHi/def.ser"));
        Car car1= (Car)objectInputStream.readObject();
        System.out.println(car1);







    }
}
