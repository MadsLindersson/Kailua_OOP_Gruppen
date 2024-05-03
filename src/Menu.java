import java.util.Scanner;

public class Menu {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

            System.out.println("1. Show car options");
            System.out.println("2. Show customer options");
            System.out.println("3. Show what's currently rented");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("1. Rent a car");
                    System.out.println("2. Return a car");
                    System.out.println("3. Show all cars");
                    System.out.println("4. Create a car");
                    System.out.println("5. Remove a car");
                    System.out.println("6. Edit a car");
                    int innerChoice = scanner.nextInt();
                    if (innerChoice == 1) {
                        RentCar.rentCarFromMenu();
                    } else if (innerChoice == 2) {
                        ReturnCar.returnCarFromMenu();
                    } else if (innerChoice == 3) {
                        Print.printCars();
                    } else if (innerChoice == 4) {
                        CreateCar.createCar();
                    } else if (innerChoice == 5){
                        RemoveCar.removeCar();
                    } else if (innerChoice == 6){
                        EditCar.editCar();
                    } else {
                        returnToMenu();
                    }
                    break;
                case 2:
                    System.out.println("1. Create a customer");
                    System.out.println("2. Print customers");
                    System.out.println("3. Remove a csutomer");
                    int innerChoice2 = scanner.nextInt();
                    if (innerChoice2 == 1) {
                        Customer.createCustomer();
                    } else if (innerChoice2 == 2) {
                        Print.printCustomers();
                    } else if (innerChoice2 ==3) {
                        Customer.removeCustomer();
                    }else {
                        returnToMenu();
                    }
                    break;
                case 3:
                    Print.printRentals();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

    }

    public static void returnToMenu(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Return to menu? Then press 1");
            int choice = scanner.nextInt();
            if (choice == 1) {
                showMenu();
            }
    }
}
