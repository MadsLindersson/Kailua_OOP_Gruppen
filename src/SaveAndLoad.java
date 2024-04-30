import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveAndLoad {
    public static void loadCars() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Main.CARS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                // Extract information from parts and create Car objects
                Main.cars.add(new Car(
                        parts[0], // brand
                        parts[1], // model
                        parts[2], // fuelType
                        Integer.parseInt(parts[3].trim()), // registrationNumber
                        parts[4], // firstRegistrationYearAndMonth
                        Integer.parseInt(parts[5].trim()), // odometer
                        Boolean.parseBoolean(parts[6].trim()), // gear
                        Integer.parseInt(parts[7].trim()), // seats
                        Boolean.parseBoolean(parts[8].trim()), // aircon
                        Boolean.parseBoolean(parts[9].trim()), // cruiseControl
                        Integer.parseInt(parts[10].trim()), // horsePower
                        Boolean.parseBoolean(parts[11].trim()), // spoiler
                        Integer.parseInt(parts[12].trim()), // ccm
                        Integer.parseInt(parts[13].trim()) // trunkLiters
                ));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   public static void loadCustomers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Main.CUSTOMERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                // Extract information from parts and create Customer objects
                Main.customers.add(new Customer(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadRentals() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Main.RENTALS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                // Extract information from parts and create Rental objects
                Main.rentals.add(new Rental(parts[0], parts[1], parts[2], Integer.parseInt(parts[3].trim()), Integer.parseInt(parts[4].trim()), parts[5]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveCars() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Main.CARS_FILE))) {
            for (Car car : Main.cars) {
                writer.write(car.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveCustomers() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Main.CUSTOMERS_FILE))) {
            for (Customer customer : Main.customers) {
                writer.write(customer.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveRentals() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Main.RENTALS_FILE))) {
            for (Rental rental : Main.rentals) {
                writer.write(rental.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
