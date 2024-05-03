public class CompanyCustomerSub extends Customer {

    private String companyName;
    private String companyAddress;
    private int companyPhoneNumber;
    private int CRN;

    public CompanyCustomerSub(String name, String address, String postNumber, String city,
                              String mobilePhone, String email, String companyName, String companyAddress,
                              int companyPhoneNumber, int CRN) {
        super(name, address, postNumber, city, mobilePhone, email);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhoneNumber = companyPhoneNumber;
        this.CRN = CRN;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public int getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(int companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public int getCRN() {
        return CRN;
    }

    public void setCRN(int CRN) {
        this.CRN = CRN;
    }

    public String toString() {
        StringBuilder niceString = new StringBuilder();

        niceString.append("Company Customers:" + "\n");
        niceString.append("Name:                 " + getName() + "\n");
        niceString.append("Address:              " + getAddress() + "\n");
        niceString.append("Postal code:          " + getPostNumber() + "\n");
        niceString.append("City:                 " + getCity() + "\n");
        niceString.append("Mobile number:        " + getMobilePhone() + "\n");
        niceString.append("Email:                " + getEmail() + "\n");
        niceString.append("Company name:         " + getCompanyName() + "\n");
        niceString.append("Company address:      " + getCompanyAddress() + "\n");
        niceString.append("Company phone number: " + getCompanyPhoneNumber() + "\n");
        niceString.append("CRN:                  " + getCRN() + "\n");
        niceString.append("--------------------------------------------" + "\n");

        return niceString.toString();
    }
}


