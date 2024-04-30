class Rental {
    protected String rentersID;
    protected String fromDateAndTime;
    protected String toDateAndTime;
    protected int maxKm;
    protected int currentKm;
    protected int registrationNumber;

    public Rental(String rentersID, String fromDateAndTime, String toDateAndTime, int maxKm, int currentKm, int registrationNumber) {
        this.rentersID = rentersID;
        this.fromDateAndTime = fromDateAndTime;
        this.toDateAndTime = toDateAndTime;
        this.maxKm = maxKm;
        this.currentKm = currentKm;
        this.registrationNumber = registrationNumber;
    }

    // Getters and setters

    public String getRentersID() {
        return rentersID;
    }

    public void setRentersID(String rentersID) {
        this.rentersID = rentersID;
    }

    public String getFromDateAndTime() {
        return fromDateAndTime;
    }

    public void setFromDateAndTime(String fromDateAndTime) {
        this.fromDateAndTime = fromDateAndTime;
    }

    public String getToDateAndTime() {
        return toDateAndTime;
    }

    public void setToDateAndTime(String toDateAndTime) {
        this.toDateAndTime = toDateAndTime;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getCurrentKm() {
        return currentKm;
    }

    public void setCurrentKm(int currentKm) {
        this.currentKm = currentKm;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
        return registrationNumber;
    }

    @Override
    public String toString() {
        return rentersID + ", " + fromDateAndTime + ", " + toDateAndTime + ", " + maxKm + ", " + currentKm + ", " + registrationNumber;
    }
}


