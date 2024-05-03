import java.util.Scanner;

public class RentCar {
    public static void rentCarFromMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customers registered");
        for (Customer customer : Main.customers) {
            System.out.println(customer.getName() + " - " + customer.getEmail());
        }
        System.out.println("Enter customer details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        // Find the customer
        Customer customer = null;
        for (Customer c : Main.customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                customer = c;
                break;
            }
        }

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        // Display available cars
        System.out.println("Available cars:");
        for (Car car : Main.cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " - " + car.getRegistrationNumber());
        }

        // Get car details from user
        System.out.print("Enter registration number of the car you want to rent: ");
        int regNumber = scanner.nextInt();

        // Find the car
        Car selectedCar = null;
        for (Car car : Main.cars) {
            if (car.getRegistrationNumber() == regNumber) {
                selectedCar = car;
                break;
            }
        }

        if (selectedCar == null) {
            System.out.println("Car not found.");
            return;
        }

        // Enter rental details
        System.out.print("Enter rental start date and time (DD-MM-YYYY): ");
        String fromDateAndTime = scanner.next();
        System.out.print("Enter rental end date and time (DD-MM-YYYY): ");
        String toDateAndTime = scanner.next();
        System.out.print("Enter maximum kilometers allowed: ");
        int maxKm = scanner.nextInt();

        // Rent the car
        rentCar(customer, selectedCar, fromDateAndTime, toDateAndTime, maxKm);
        System.out.println("Car rented successfully.");

    }

    public static void rentCar(Customer customer, Car car, String fromDateAndTime, String toDateAndTime, int maxKm) {
        // Create a new Rental object
        Rental rental = new Rental(customer.getName(), fromDateAndTime, toDateAndTime, maxKm, car.getOdometer(), car.getRegistrationNumber());
        // Update the kilometers driven by the car
        car.setOdometer(car.getOdometer() + maxKm);
        // Add the rental to the list of rentals
        Main.rentals.add(rental);
        // Save the changes to the rentals file
        SaveAndLoad.saveRentals();
        System.out.println("Car rented successfully.");
        Menu.returnToMenu();
    }
}
