import java.util.Scanner;

public class ReturnCar {
    public static void returnCarFromMenu() {
        Scanner scanner = new Scanner(System.in);
        for (Rental rentals : Main.rentals) {
            System.out.println(rentals.getRentersID() + "Registration number: " +  rentals.getRegistrationNumber());
        }
        System.out.print("Enter registration number of the car you want to return: ");
        int regNumber = scanner.nextInt();

        // Find the rental associated with the car
        Rental rentalToRemove = null;
        for (Rental rental : Main.rentals) {
            if (rental.getRegistrationNumber() == regNumber) {
                rentalToRemove = rental;
                break;
            }
        }

        if (rentalToRemove == null) {
            System.out.println("Rental not found for car with registration number: " + regNumber);
            return;
        }

        Main.rentals.remove(rentalToRemove);
        // Save the changes to the rentals file
        SaveAndLoad.saveRentals();
        System.out.println("Car returned successfully.");
        Menu.returnToMenu();
    }
    public static void returnCar(Customer customer, Car car) {
        // Find the rental associated with the customer and car
        Rental rentalToRemove = null;
        for (Rental rental : Main.rentals) {
            if (rental.getRentersID().equals(customer.getName()) && rental.getRegistrationNumber() == (car.getRegistrationNumber())) {
                rentalToRemove = rental;
                break;
            }
        }
        // Remove the rental from the list of rentals
        if (rentalToRemove != null) {
            Main.rentals.remove(rentalToRemove);
            // Save the changes to the rentals file
            Main.saveAndLoadData();
            Menu.returnToMenu();
        }
    }
}
