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

    public Car(String brand, String model, String fuelType, int registrationNumber,
               String firstRegistrationYearAndMonth, int odometer, boolean gear, int seats,
               boolean aircon, boolean cruiseControl, int horsePower, boolean spoiler, int ccm, int trunkLiters) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.firstRegistrationYearAndMonth = firstRegistrationYearAndMonth;
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

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFirstRegistrationYearAndMonth() {
        return firstRegistrationYearAndMonth;
    }

    public int getOdometer() {
        return odometer;
    }

    public String getGear() {
        if (gear) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public int getSeats() {
        return seats;
    }

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

    public int getHorsePower() {
        return horsePower;
    }

    public String getSpoiler() {
        if (spoiler) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public int getCcm() {
        return ccm;
    }

    public int getTrunkLiters() {
        return trunkLiters;
    }

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
}
