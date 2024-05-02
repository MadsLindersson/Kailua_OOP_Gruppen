import java.util.Scanner;

public class CreateCar {
    public static void createCar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter brand");
        String brand = scan.next();
        System.out.println("Enter model");
        String model = scan.next();
        System.out.println("Enter fuel type (Petrol / Diesel)");
        String fueltype = scan.next();
        System.out.println("Enter registration number (example: 1234)");
        int regNumber = scan.nextInt();
        System.out.println("Enter the year and month of the first registration (xxxx/xx)");
        String yAndM = scan.next();
        System.out.println("Enter amount of driven km");
        int odometer = scan.nextInt();
        System.out.println("Is the car automatic? (Y/N))");
        String gearAnswer = scan.next();
        boolean gear;

        if(gearAnswer.equalsIgnoreCase("Y"))    {
            gear = true;
        }else   {
            gear = false;
        }

        System.out.println("Enter number of seats");
        int seats = scan.nextInt();
        System.out.println("Does the car have aircondition? (Y/N)");
        String airconAnswer = scan.next();

        boolean aircon;

        if(airconAnswer.equalsIgnoreCase("Y"))    {
            aircon = true;
        }else   {
            aircon = false;
        }

        System.out.println("Does the car have cruise control (Y/N)");
        String cruisecontrolAnswer = scan.next();

        boolean cruisecontrol;

        if(cruisecontrolAnswer.equalsIgnoreCase("Y"))    {
            cruisecontrol = true;
        }else   {
            cruisecontrol = false;
        }

        System.out.println("Enter amount of horsepower");
        int horsepower = scan.nextInt();
        System.out.println("Does the car have a spoiler? (Y/N)");
        String spoilerAnswer= scan.next();

        boolean spoiler;

        if(spoilerAnswer.equalsIgnoreCase("Y"))    {
            spoiler = true;
        }else   {
            spoiler = false;
        }

        System.out.println("enter the ccm amount");
        int ccm = scan.nextInt();
        System.out.println("Enter trunk size in liters");
        int trunk = scan.nextInt();


        Car newCar = new Car(brand, model, fueltype, regNumber,yAndM, odometer, gear, seats, aircon,
                cruisecontrol, horsepower, spoiler, ccm, trunk);

        // Add the new car to the list of cars
        Main.cars.add(newCar);

        // Save the changes to the cars file
        SaveAndLoad.saveCars();
        SaveAndLoad.loadCustomers();

        System.out.println("New car created successfully.");

        Menu.returnToMenu();
    }
}

