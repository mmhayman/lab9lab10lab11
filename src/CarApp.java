import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by michelhayman on 7/17/17.
 */
public class CarApp {

    public static void main(String[] args) {

        int userInput;
        Scanner scan = new Scanner (System.in);


        System.out.println("How many cars do you want: " );
        userInput = scan.nextInt();
        scan.nextLine();

        ArrayList<Car> carList = new ArrayList<>(userInput);


        for (int i = 0; i < userInput; i++) {

            System.out.println("Enter a make: ");
            String make = scan.nextLine();


            System.out.println("Enter a model: ");
            String model = scan.nextLine();


            System.out.println("Enter a year: ");
            int year = scan.nextInt();


            System.out.println("Enter a price: ");
            double price = scan.nextDouble();

            scan.nextLine();

            carList.add(new Car(make, model, year, price));
        }
        for (Car newCars : carList) {
            System.out.println( );
            System.out.println(newCars );
        }

        }


    }

