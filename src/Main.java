import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String CARS_FILE = "cars.txt";
    public static final String CUSTOMERS_FILE = "customers.txt";
    public static final String RENTALS_FILE = "rentals.txt";

    public static ArrayList<Car> cars = new ArrayList<>();
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Rental> rentals = new ArrayList<>();

    public static void main(String[] args) {
        loadData();
        AsciiArt.Ascii();
        Menu.showMenu();

    }

    private static void loadData() {
        SaveAndLoad.loadCars();
        SaveAndLoad.loadCustomers();
        SaveAndLoad.loadRentals();
    }

    public static void rentCar(Customer customer, Car car, String fromDateAndTime, String toDateAndTime, int maxKm) {
        // Create a new Rental object
        Rental rental = new Rental(customer.getName(), fromDateAndTime, toDateAndTime, maxKm, car.getKilometersDriven(), car.getRegistrationNumber());
        // Update the kilometers driven by the car
        car.setKilometersDriven(car.getKilometersDriven() + maxKm);
        // Add the rental to the list of rentals
        rentals.add(rental);
        // Save the changes to the rentals file
        SaveAndLoad.saveRentals();
        // Save the changes to the cars file
        SaveAndLoad.saveCars();
    }

    public static void returnCar(Customer customer, Car car) {
        // Find the rental associated with the customer and car
        Rental rentalToRemove = null;
        for (Rental rental : rentals) {
            if (rental.getRentersID().equals(customer.getName()) && rental.getRegistrationNumber().equals(car.getRegistrationNumber())) {
                rentalToRemove = rental;
                break;
            }
        }
        // Remove the rental from the list of rentals
        if (rentalToRemove != null) {
            rentals.remove(rentalToRemove);
            // Save the changes to the rentals file
            SaveAndLoad.saveRentals();
        }
    }

    public static void rentCarFromMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        // You can add more customer details input here

        // Find the customer
        Customer customer = null;
        for (Customer c : customers) {
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
        for (Car car : cars) {
            System.out.println(car.getBrandAndModel() + " - " + car.getRegistrationNumber());
        }

        // Get car details from user
        System.out.print("Enter registration number of the car you want to rent: ");
        String regNumber = scanner.nextLine();

        // Find the car
        Car selectedCar = null;
        for (Car car : cars) {
            if (car.getRegistrationNumber().trim().equalsIgnoreCase(regNumber.trim())) {
                selectedCar = car;
                break;
            }
        }

        if (selectedCar == null) {
            System.out.println("Car not found.");
            return;
        }

        // Enter rental details
        System.out.print("Enter rental start date and time (YYYY-MM-DD HH:MM): ");
        String fromDateAndTime = scanner.nextLine();
        System.out.print("Enter rental end date and time (YYYY-MM-DD HH:MM): ");
        String toDateAndTime = scanner.nextLine();
        System.out.print("Enter maximum kilometers allowed: ");
        int maxKm = scanner.nextInt();

        // Rent the car
        rentCar(customer, selectedCar, fromDateAndTime, toDateAndTime, maxKm);
        System.out.println("Car rented successfully.");
    }
    public static void returnCarFromMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter registration number of the car you want to return: ");
        String regNumber = scanner.nextLine();

        // Find the rental associated with the car
        Rental rentalToRemove = null;
        for (Rental rental : rentals) {
            if (rental.getRegistrationNumber().trim().equalsIgnoreCase(regNumber.trim())) {
                rentalToRemove = rental;
                break;
            }
        }

        if (rentalToRemove == null) {
            System.out.println("Rental not found for car with registration number: " + regNumber);
            return;
        }

        // Update the rental information
        // For example, you might want to update the toDateAndTime or other details here

        // Remove the rental from the list of rentals
        rentals.remove(rentalToRemove);
        // Save the changes to the rentals file
        SaveAndLoad.saveRentals();
        System.out.println("Car returned successfully.");
    }


}