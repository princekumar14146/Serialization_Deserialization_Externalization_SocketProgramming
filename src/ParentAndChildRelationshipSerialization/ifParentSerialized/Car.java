package ParentAndChildRelationshipSerialization.ifParentSerialized;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {

     int carId;
     String carName;

    public Car(int id, String name, int carId, String carName) {
        super(id, name);
        this.carId = carId;
        this.carName=carName;
    }

    @Override
    public String toString() {
        return  super.id+" "+super.name+" "+carId+" "+carName;
    }
}
