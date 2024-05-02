import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String CARS_FILE = "cars.txt";
    public static final String PRIVATECUSTOMERS_FILE = "PrivateCustomers";
    public static final String COMPANYCUSTOMERS_FILE = "CompanyCustomers";
    public static final String RENTALS_FILE = "rentals.txt";

    public static ArrayList<Car> cars = new ArrayList<>();
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static ArrayList<Rental> rentals = new ArrayList<>();

    public static void main(String[] args) {
        saveAndLoadData();
        AsciiArt.Ascii();
        Menu.showMenu();
    }
    public static void saveAndLoadData() {
        SaveAndLoad.loadCars();
        SaveAndLoad.loadCustomers();
        SaveAndLoad.loadRentals();
    }
}