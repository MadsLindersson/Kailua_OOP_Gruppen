import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveAndLoad {
    public static void loadCars() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Main.CARS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Main.cars.add(new Car(
                        parts[0].trim(), // brand
                        parts[1].trim(), // model
                        parts[2].trim(), // fuelType
                        Integer.parseInt(parts[3].trim()), // registrationNumber
                        parts[4].trim(), // firstRegistrationYearAndMonth
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
        try (BufferedReader reader = new BufferedReader(new FileReader(Main.PRIVATECUSTOMERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                // Extract information from parts and create Customer objects
                Main.customers.add(new PrivateCustomerSub(
                        parts[0].trim(), //Name
                        parts[1].trim(), //Address
                        parts[2].trim(), //Postal code
                        parts[3].trim(), //City
                        parts[4].trim(), //Mobile number
                        parts[5].trim(), //Email
                        Integer.parseInt(parts[6].trim()), //License number
                        parts[7].trim()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       try (BufferedReader reader = new BufferedReader(new FileReader(Main.COMPANYCUSTOMERS_FILE))) {
           String line;
           while ((line = reader.readLine()) != null) {
               String[] parts = line.split(",");
               // Extract information from parts and create Customer objects
               Main.customers.add(new CompanyCustomerSub(
                       parts[0].trim(), //Name
                       parts[1].trim(), //Address
                       parts[2].trim(), //Postal code
                       parts[3].trim(), //City
                       parts[4].trim(), //Mobile number
                       parts[5].trim(), //Email
                       parts[6].trim(), //Company name
                       parts[7].trim(), //Company address
                       Integer.parseInt(parts[8].trim()), //Company phone number
                       Integer.parseInt(parts[9].trim()))); //CRN

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
                Main.rentals.add(new Rental(
                          parts[0] // rentersId
                        , parts[1] // fromDateAndTime
                        , parts[2] // toDateAndTime
                        , Integer.parseInt(parts[3].trim()) //maxKm
                        , Integer.parseInt(parts[4].trim()) // CurrentKm
                        , Integer.parseInt(parts[5].trim()))); //registrationNumber
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Main.PRIVATECUSTOMERS_FILE))) {
            try (BufferedWriter writer2 = new BufferedWriter(new FileWriter(Main.COMPANYCUSTOMERS_FILE))) {
            for (Customer customer : Main.customers) {
                if(customer instanceof PrivateCustomerSub) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(customer.getName() + ", ");
                    sb.append(customer.getAddress() + ", ");
                    sb.append(customer.getPostNumber() +  ", ");
                    sb.append(customer.getCity() + ", ");
                    sb.append(customer.getMobilePhone() + ", ");
                    sb.append(customer.getEmail() + ", ");
                    sb.append(((PrivateCustomerSub) customer).getLicenseNumber() + ", ");
                    sb.append(((PrivateCustomerSub) customer).getDriverSinceDate() + ", ");

                    writer.write(sb.toString());

                    writer.newLine();

                }if (customer instanceof CompanyCustomerSub) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(customer.getName() + ", ");
                        sb.append(customer.getAddress() + ", ");
                        sb.append(customer.getPostNumber() + ", ");
                        sb.append(customer.getCity() + ", ");
                        sb.append(customer.getMobilePhone() + ", ");
                        sb.append(customer.getEmail() + ", ");
                        sb.append(((CompanyCustomerSub) customer).getCompanyName() + ", ");
                        sb.append(((CompanyCustomerSub) customer).getCompanyAddress() + ", ");
                        sb.append(((CompanyCustomerSub) customer).getCompanyPhoneNumber() + ", ");
                        sb.append(((CompanyCustomerSub) customer).getCRN() + ", ");

                        writer2.write(sb.toString());

                        writer2.newLine();
                    }

                }
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
