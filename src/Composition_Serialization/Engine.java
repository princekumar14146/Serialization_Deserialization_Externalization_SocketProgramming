package Composition_Serialization;

import java.io.Serializable;

public class Engine implements Serializable {

    // composition means strong relationship

    int engineId;
    int engineStroke;

    public Engine(int engineId, int engineStroke) {
        this.engineId = engineId;
        this.engineStroke = engineStroke;
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public int getEngineStroke() {
        return engineStroke;
    }

    public void setEngineStroke(int engineStroke) {
        this.engineStroke = engineStroke;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineId=" + engineId +
                ", engineStroke=" + engineStroke +
                '}';
    }
}
