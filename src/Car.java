import java.util.Scanner;

class Car {
    private String brand; //1
    private String model; //2
    private String fuelType; //3
    private int registrationNumber; //4
    private String firstRegistrationYearAndMonth; //5
    private int odometer; //6
    private boolean gear; //7
    private int seats; //8
    private boolean aircon; //9
    private boolean cruiseControl; //10
    private int horsePower; //11
    private boolean spoiler; //12
    private int ccm; //13
    private int trunkLiters; //14

    public Car (String brand, String model, String fuelType, int registrationNumber,
                    String firstRegistrationYearAndMonth, int odometer, boolean gear, int seats,
                    boolean aircon, boolean cruiseControl, int horsePower, boolean spoiler, int ccm, int trunkLiters)   {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this. firstRegistrationYearAndMonth = firstRegistrationYearAndMonth;
        this.odometer = odometer;
        this.gear = gear;
        this.seats = seats;
        this.aircon = aircon;
        this.cruiseControl = cruiseControl;
        this.horsePower = horsePower;
        this.spoiler = spoiler;
        this.ccm = ccm;
        this.trunkLiters = trunkLiters;

    }
    public Car ()   {}

    public String getBrand()  { return brand; }

    public String getModel()  { return model; }

    public String getFuelType() { return fuelType; }

    public int getRegistrationNumber() { return registrationNumber; }

    public String getFirstRegistrationYearAndMonth() { return firstRegistrationYearAndMonth; }

    public int getOdometer() { return odometer; }

    public String getGear() {
        if (gear) {
            return "Yes";
        } else {
            return "No";
        }
    }
    public int getSeats() { return seats; }

    public String getAircon() {
        if (aircon) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String getCruiseControl() {
        if (cruiseControl) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public int getHorsePower() { return horsePower; }

    public String getSpoiler() {
        if (spoiler) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public int getCcm() { return ccm; }

    public int getTrunkLiters() { return trunkLiters; }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setFirstRegistrationYearAndMonth(String firstRegistrationYearAndMonth) {
        this.firstRegistrationYearAndMonth = firstRegistrationYearAndMonth;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setAircon(boolean aircon) {
        this.aircon = aircon;
    }

    public void setCruiseControl(boolean cruiseControl) {
        this.cruiseControl = cruiseControl;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public void setTrunkLiters(int trunkLiters) {
        this.trunkLiters = trunkLiters;
    }

    @Override
    public String toString() {
        return brand + ", " + model + ", " + fuelType + ", " + registrationNumber + ", " + firstRegistrationYearAndMonth + ", " +
                odometer + ", " + gear + ", " + seats + ", " + aircon + ", " + cruiseControl + ", " + horsePower + ", " +
                spoiler + ", " + ccm + ", " + trunkLiters;
    }

    public static void createCar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter brand");
        String brand = scan.next();
        System.out.println("Enter model");
        String model = scan.next();
        System.out.println("Enter fuel type (Petrol / Diesel)");
        String fueltype = scan.next();
        System.out.println("Enter registration number (example: 1234)");
        int regNumber = scan.nextInt();
        System.out.println("Enter the year and month of the first registration (xxxx/xx)");
        String yAndM = scan.next();
        System.out.println("Enter amount of driven km");
        int odometer = scan.nextInt();
        System.out.println("Is the car automatic? (Y/N))");
        String gearAnswer = scan.next();
        boolean gear;

        if(gearAnswer.equalsIgnoreCase("Y"))    {
            gear = true;
        }else   {
            gear = false;
        }

        System.out.println("Enter number of seats");
        int seats = scan.nextInt();
        System.out.println("Does the car have aircondition? (Y/N)");
        String airconAnswer = scan.next();

        boolean aircon;

        if(airconAnswer.equalsIgnoreCase("Y"))    {
            aircon = true;
        }else   {
            aircon = false;
        }

        System.out.println("Does the car have cruise control (Y/N)");
        String cruisecontrolAnswer = scan.next();

        boolean cruisecontrol;

        if(cruisecontrolAnswer.equalsIgnoreCase("Y"))    {
            cruisecontrol = true;
        }else   {
            cruisecontrol = false;
        }

        System.out.println("Enter amount of horsepower");
        int horsepower = scan.nextInt();
        System.out.println("Does the car have a spoiler? (Y/N)");
        String spoilerAnswer= scan.next();

        boolean spoiler;

        if(spoilerAnswer.equalsIgnoreCase("Y"))    {
            spoiler = true;
        }else   {
            spoiler = false;
        }

        System.out.println("enter the ccm amount");
        int ccm = scan.nextInt();
        System.out.println("Enter trunk size in liters");
        int trunk = scan.nextInt();


        Car newCar = new Car(brand, model, fueltype, regNumber,yAndM, odometer, gear, seats, aircon,
                cruisecontrol, horsepower, spoiler, ccm, trunk);

        // Add the new car to the list of cars
        Main.cars.add(newCar);

        // Save the changes to the cars file
        SaveAndLoad.saveCars();
        SaveAndLoad.loadCustomers();

        System.out.println("New car created successfully.");

        Menu.returnToMenu();
    }
}
