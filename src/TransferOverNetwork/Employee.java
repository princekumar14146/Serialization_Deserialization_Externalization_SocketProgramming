package TransferOverNetwork;

import java.io.Serializable;

public class Employee implements Serializable {

    /*
       If we are using Transient and static non access modifier then by uisng serialization we can't serialize
       these fields private and final fields gets synchronized.
     */

    public static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+address;
    }
}
