public class Print {
    public static void printCars() {
        System.out.println("Cars:");
        for (Car car : Main.cars) {
            System.out.println("Brand:               " + car.getBrand());
            System.out.println("Model:               " + car.getModel());
            System.out.println("Fuel type:           " + car.getFuelType());
            System.out.println("Registration Number: " + car.getRegistrationNumber());
            System.out.println("Registration Date:   " + car.getFirstRegistrationYearAndMonth());
            System.out.println("Kilometers Driven:   " + car.getOdometer());
            System.out.println("Gear type:           " + car.getGear());
            System.out.println("Number of seats:     " + car.getSeats());
            System.out.println("Aircon:              " + car.getAircon());
            System.out.println("Cruise control:      " + car.getCruiseControl());
            System.out.println("Horsepower:          " + car.getHorsePower());
            System.out.println("Spoiler:             " + car.getSpoiler());
            System.out.println("Ccm:                 " + car.getCcm());
            System.out.println("Size of trunk:       " + car.getTrunkLiters());
            System.out.println("--------------------------------------------");
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