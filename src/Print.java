public class Print {
    public static void printCars() {
        System.out.println("Cars:");
        for (Car car : Main.cars) {
            System.out.println("Brand and Model: " + car.getBrandAndModel());
            System.out.println("Registration Number: " + car.getRegistrationNumber());
            System.out.println("Fuel Type: " + car.getFuelType());
            System.out.println("Registration Date: " + car.getFirstRegistrationDate());
            System.out.println("Kilometers Driven: " + car.getKilometersDriven());
            System.out.println("--------------------------------------------");
            System.out.println();
        }
    }

    public static void printCustomers() {
        System.out.println("Customer list:");
        for (Customer customer : Main.customers) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Post number: " + customer.getPostNumber());
            System.out.println("Mobile phone: " + customer.getMobilePhone());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("--------------------------------------------");
            System.out.println();
        }
    }

    public static void printRentals() {
        System.out.println("Rentals:");
        for (Rental rentals : Main.rentals) {
            System.out.println("Name: " + rentals.getRentersID());
            System.out.println("Cars registration number: " + rentals.getRegistrationNumber());
            System.out.println("Date for start of renting: " + rentals.getFromDateAndTime());
            System.out.println("Date for end of renting: " + rentals.getToDateAndTime());
            System.out.println("--------------------------------------------");
            System.out.println();

        }
    }

}