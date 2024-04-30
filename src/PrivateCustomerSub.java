public class PrivateCustomerSub extends Customer {

    private int licenseNumber;
    private String driverSinceDate;

    public PrivateCustomerSub(String name, String address, String postNumber, String city,
                              String mobilePhone, String email, int licenseNumber, String driverSinceDate) {
        super(name, address, postNumber, city, mobilePhone, email);
        this.licenseNumber = licenseNumber;
        this.driverSinceDate = driverSinceDate;
    }

    public int getLicenseNumber() {return licenseNumber;}

    public void setLicenseNumber(int licenseNumber) {this.licenseNumber = licenseNumber;}

    public String getDriverSinceDate() {return driverSinceDate;}

    public void setDriverSinceDate(String driverSinceDate) {this.driverSinceDate = driverSinceDate;}

}