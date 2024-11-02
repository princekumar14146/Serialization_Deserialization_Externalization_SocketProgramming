package Composition_Serialization;

import java.io.Serializable;

public class Car implements Serializable{

    public int carId;
    public String carName;
    public Engine engine;

    public Car(int carId, String carName, Engine engine)
    {
        this.carId = carId;
        this.carName = carName;
        this.engine = engine;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                ", engine=" + engine +
                '}';
    }
}
