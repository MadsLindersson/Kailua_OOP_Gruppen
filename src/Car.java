import java.util.Scanner;

class Car {
    String brandAndModel;
    String fuelType;
    String registrationNumber;
    String firstRegistrationDate;
    int kilometersDriven;

    public Car(String brandAndModel, String fuelType, String registrationNumber, String firstRegistrationDate, int kilometersDriven) {
        this.brandAndModel = brandAndModel;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.firstRegistrationDate = firstRegistrationDate;
        this.kilometersDriven = kilometersDriven;
    }

    // Getters and setters

    public String getBrandAndModel() {
        return brandAndModel;
    }

    public void setBrandAndModel(String brandAndModel) {
        this.brandAndModel = brandAndModel;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getFirstRegistrationDate() {
        return firstRegistrationDate;
    }

    public void setFirstRegistrationDate(String firstRegistrationDate) {
        this.firstRegistrationDate = firstRegistrationDate;
    }

    public int getKilometersDriven() {
        return kilometersDriven;
    }

    public void setKilometersDriven(int kilometersDriven) {
        this.kilometersDriven = kilometersDriven;
    }

    @Override
    public String toString() {
        return brandAndModel + ", " + fuelType + ", " + registrationNumber + ", " + firstRegistrationDate + ", " + kilometersDriven;
    }

    public static void createCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car details:");
        System.out.print("Brand and Model: ");
        String brandAndModel = scanner.nextLine();
        System.out.print("Fuel Type: ");
        String fuelType = scanner.nextLine();
        System.out.print("Registration Number: ");
        String registrationNumber = scanner.nextLine();
        System.out.print("First Registration Date (YYYYMMDD): ");
        String firstRegistrationDate = scanner.nextLine();
        System.out.print("Kilometers Driven: ");
        int kilometersDriven = scanner.nextInt();

        // Create a new car object
        Car newCar = new Car(brandAndModel, fuelType, registrationNumber, firstRegistrationDate, kilometersDriven);

        // Add the new car to the list of cars
        Main.cars.add(newCar);

        // Save the changes to the cars file
        SaveAndLoad.saveCars();

        System.out.println("New car created successfully.");

        Menu.returnToMenu();
    }
}
