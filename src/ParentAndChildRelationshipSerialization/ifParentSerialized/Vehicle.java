package ParentAndChildRelationshipSerialization.ifParentSerialized;

import java.io.Serializable;

public class Vehicle {
    /*
        If parent class implements serializable then its child class also gets serialized automatically
     */

    int id;
    String name;

    public Vehicle(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return id+" "+name;
    }
}
