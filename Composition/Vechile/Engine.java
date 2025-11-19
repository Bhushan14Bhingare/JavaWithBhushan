package Composition.Vechile;

public class Engine {
    private String model; 	
    private int engineCapacity;

    public Engine(String model, int engineCapacity) {
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Engine Model=" + model + ", engineCapacity=" + engineCapacity+"cc";
    }
   
}
