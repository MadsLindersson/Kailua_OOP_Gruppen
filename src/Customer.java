import java.util.Scanner;

class Customer {
    private String name; //1
    private String address; //2
    private String postNumber; //3
    private String city; //4
    private String mobilePhone; //5
    private String email; //6

    public Customer(String name, String address, String postNumber, String city, String mobilePhone, String email) {
        this.name = name;
        this.address = address;
        this.postNumber = postNumber;
        this.city = city;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }

    // Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + postNumber + ", " + city + ", " + mobilePhone  + ", " + email;
    }

    public static void createCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Post number: ");
        String postNumber = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("Mobile phone: ");
        String mobilePhone = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        // Create a new customer object
        Customer newCustomer = new Customer(name, address, postNumber, city, mobilePhone, email);

        // Add the new customer to the list of customers
        Main.customers.add(newCustomer);

        // Save the changes to the customers file
        Main.saveAndLoadData();

        System.out.println("New customer created successfully.");
        Menu.returnToMenu();
    }

    public static void removeCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the customer you want to remove: ");
        String name = scanner.nextLine();

        // Find the customerd
        Customer customerToRemove = null;
        for (Customer customer : Main.customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                customerToRemove = customer;
                break;
            }
        }

        // If customer not found, display message and return
        if (customerToRemove == null) {
            System.out.println("Customer not found.");
            return;
        }

        // Remove the customer from the list of customers
        Main.customers.remove(customerToRemove);

        // Save the changes to the customers file
        Main.saveAndLoadData();

        System.out.println("Customer removed successfully.");
        Menu.returnToMenu();
    }
}
