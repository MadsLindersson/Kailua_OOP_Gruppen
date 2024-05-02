import java.util.Scanner;

public class RemoveCar {
    public static void removeCar() {
    Scanner scanner = new Scanner(System.in);
        for (Car car : Main.cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " - Car Registration: " + car.getRegistrationNumber());
        }
    System.out.print("Enter the cars registration number you want to delete: ");
    int regNumber = scanner.nextInt();

    // Find the car
    Car carToRemove = null;
    for (Car car : Main.cars) {
        if (car.getRegistrationNumber() == regNumber) {
            carToRemove = car;
            break;
        }
    }

    // If customer not found, display message and return
    if (carToRemove == null) {
        System.out.println("Car not found.");
        return;
    }

    // Remove the customer from the list of customers
    Main.cars.remove(carToRemove);

    // Save the changes to the customers file
    SaveAndLoad.saveCars();
    SaveAndLoad.loadCars();
    System.out.println("Car removed successfully.");
    Menu.returnToMenu();
}
}

