package Externalization;


import java.io.*;

public class Driver {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
           if there are 1000 fields in particular DTO class then if we want to serialize only some fields and we want rest fields
           we do not have to serialize then it is not good to have Transient keyword we have to write with all fields
           so then Externalization came in ocntact.
         */
        // storing Object Into File   externalization
        Employee employee = new Employee(1,"Prince","Bihar");
        FileOutputStream fileOutputStream = new FileOutputStream("/home/bonami/aiseHi/externalization.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        employee.writeExternal(objectOutputStream);


        // deserialization

        FileInputStream fileInputStream = new FileInputStream("/home/bonami/aiseHi/externalization.ser");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        employee.readExternal(objectInputStream);


    }
}
