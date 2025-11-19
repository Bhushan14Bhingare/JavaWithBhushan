package Composition.Vechile;

public class Car {
    private String make; 	
    private String model; 	
    private int year; 	
    private final Engine engine;
    public Car(String make, String model, int year,String engineModel,int engineCapacity ) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineModel, engineCapacity);
    }
    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + ","+engine.toString();
    } 

}
