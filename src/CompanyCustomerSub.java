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
}


