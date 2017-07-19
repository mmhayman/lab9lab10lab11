import java.util.Scanner;

/**
 * Created by michelhayman on 7/17/17.
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private double price;


    // blank constructor
    public Car () { }

    // constructor with four arguments
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    @Override
    public String toString() {
        return "Make: " + make + "\n" + "Model: " + model + "\n" + "Year: " + year + "\n" + "Price: $" + price + "\n";

    }
}
