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

    public String toString()    {
        StringBuilder niceString = new StringBuilder();

        niceString.append("Name:          " + getName() + "\n");
        niceString.append("Address:       " + getAddress() + "\n");
        niceString.append("Postal code:   " + getPostNumber() + "\n");
        niceString.append("City:          " + getCity() + "\n");
        niceString.append("Mobile number: " + getMobilePhone() + "\n");
        niceString.append("Email:         " + getEmail() + "\n");
        niceString.append("Licensenumber: " + getLicenseNumber() + "\n");
        niceString.append("Driver since:  " + getDriverSinceDate() + "\n");
        niceString.append("--------------------------------------------" + "\n");

        return niceString.toString();

       /* for (Customer customer : Main.customers) {
            System.out.println("Name: " + customer.getName());
            System.out.println("Address: " + customer.getAddress());
            System.out.println("Post number: " + customer.getPostNumber());
            System.out.println("City: " + customer.getCity());
            System.out.println("Mobile phone: " + customer.getMobilePhone());
            System.out.println("Email: " + customer.getEmail());
            System.out.println("Licensenumber: " + );
            System.out.println("Drivers since: " + );
            System.out.println("--------------------------------------------");
            System.out.println();
        }*/
    }
}