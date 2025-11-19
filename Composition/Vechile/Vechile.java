package Composition.Vechile;

import java.util.Scanner;

public class Vechile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a model of engine : ");
        String engineModel = sc.nextLine();

       System.out.print("Enter a capacity of engine : ");
       int capacity = Integer.parseInt(sc.nextLine());

       System.out.print("Enter a car model name : ");
       String model = sc.nextLine();

       System.out.print("Enter a car company nmae : ");
       String company = sc.nextLine();

       System.out.print("Enter a year of manufacturing : ");
        int year = Integer.parseInt(sc.nextLine()); 
        
        Car car = new Car(company,model,year,engineModel,capacity);
        System.out.println(car);
    }
}
