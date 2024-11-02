package ParentGetsNotSerializedChildGetsSerialized;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {

    private int carId;
    private String carName;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return  super.getVehicleId()+" "+super.getVehicleId()+" "+
                "carId=" + carId +
                ", carName=" + carName +
                '}';
    }
}
