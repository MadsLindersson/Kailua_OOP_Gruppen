import java.util.Scanner;

public class EditCar {
    public static void editCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the registration number of the car you want to edit: ");
        int registrationNumber = scanner.nextInt();

        Car carToEdit = null;
        for (Car car : Main.cars) {
            if (car.getRegistrationNumber() == registrationNumber) {
                carToEdit = car;
                break;
            }
        }
        boolean continueEdit = false;

        if (carToEdit !=null) {
             continueEdit = true;

            System.out.println(carToEdit);

        while (continueEdit) {
            System.out.println("Choose the field to update:");
            System.out.println("1. Brand");
            System.out.println("2. Model");
            System.out.println("3. Fuel Type");
            System.out.println("4. First Registration Year And Month");
            System.out.println("5. Odometer");
            System.out.println("6. Gear");
            System.out.println("7. Seats");
            System.out.println("8. Aircon");
            System.out.println("9. Cruise Control");
            System.out.println("10. Horse Power");
            System.out.println("11. Spoiler");
            System.out.println("12. CCM");
            System.out.println("13. Trunk Liters");
            System.out.println("0. Return to menu");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter new brand: ");
                    String newBrand = scanner.nextLine();
                    carToEdit.setBrand(newBrand);
                    break;
                case 2:
                    System.out.print("Enter new model: ");
                    String newModel = scanner.nextLine();
                    carToEdit.setModel(newModel);
                    break;
                case 3:
                    System.out.print("Enter new fuel type: ");
                    String newFuelType = scanner.nextLine();
                    carToEdit.setFuelType(newFuelType);
                    break;
                case 4:
                    System.out.print("Enter new first registration year and month: ");
                    String newFirstRegYearAndMonth = scanner.nextLine();
                    carToEdit.setFirstRegistrationYearAndMonth(newFirstRegYearAndMonth);
                    break;
                case 5:
                    System.out.print("Enter new odometer: ");
                    int newOdometer = scanner.nextInt();
                    carToEdit.setOdometer(newOdometer);
                    break;
                case 6:
                    System.out.print("Enter new gear (true/false): ");
                    boolean newGear = scanner.nextBoolean();
                    carToEdit.setGear(newGear);
                    break;
                case 7:
                    System.out.print("Enter new seats: ");
                    int newSeats = scanner.nextInt();
                    carToEdit.setSeats(newSeats);
                    break;
                case 8:
                    System.out.print("Enter new aircon (true/false): ");
                    boolean newAircon = scanner.nextBoolean();
                    carToEdit.setAircon(newAircon);
                    break;
                case 9:
                    System.out.print("Enter new cruise control (true/false): ");
                    boolean newCruiseControl = scanner.nextBoolean();
                    carToEdit.setCruiseControl(newCruiseControl);
                    break;
                case 10:
                    System.out.print("Enter new horse power: ");
                    int newHorsePower = scanner.nextInt();
                    carToEdit.setHorsePower(newHorsePower);
                    break;
                case 11:
                    System.out.print("Enter new spoiler (true/false): ");
                    boolean newSpoiler = scanner.nextBoolean();
                    carToEdit.setSpoiler(newSpoiler);
                    break;
                case 12:
                    System.out.print("Enter new ccm: ");
                    int newCcm = scanner.nextInt();
                    carToEdit.setCcm(newCcm);
                    break;
                case 13:
                    System.out.print("Enter new trunk liters: ");
                    int newTrunkLiters = scanner.nextInt();
                    carToEdit.setTrunkLiters(newTrunkLiters);
                    break;
                case 0:
                    Menu.returnToMenu();
                default:
                    System.out.println("Invalid choice.");
            }
            SaveAndLoad.saveCars();
            System.out.println("Car details updated successfully.");
           }
           } else {
             System.out.println("Car with registration number " + registrationNumber + " not found.");
        }
    }
}