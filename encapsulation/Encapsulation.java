package encapsulation;

public class Encapsulation {
    private String name;
    private int roolNo;
    private double fee;
    private String standrad;
    private String aadharNo;
    private int sscPercentage;
    private String scholName;
    // Address class ref;
    private Address stdAddress;

    public Encapsulation(String name, int roolNo, double fee, String standrad, String aadharNo, Address stdAddress) {
        this.name = name;
        this.roolNo = roolNo;
        this.fee = fee;
        this.standrad = standrad;
        this.aadharNo = aadharNo;
        this.stdAddress = stdAddress;
    }

    public Address getStdAddress() {
        return stdAddress;
    }

    public void setStdAddress(Address stdAddress) {
        this.stdAddress = stdAddress;
    }

    public String getScholName() {
        return scholName;
    }

    public void setScholName(String scholName) {
        this.scholName = scholName;
    }

    public int getSscPercentage() {
        return sscPercentage;
    }

    public void setSscPercentage(int sscPercentage) {
        this.sscPercentage = sscPercentage;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public String getStandrad() {
        return standrad;
    }

    public double getFee() {
        return fee;
    }

    public int getRoolNo() {
        return roolNo;
    }

    public String getName() {
        return name;
    }
}

class Address {
    private String streetName;
    private String city;
    private int cityPincode;
    private String district;
    private String state;

    public Address(String streetName, String city, int cityPincode, String district, String state) {
        this.streetName = streetName;
        this.city = city;
        this.cityPincode = cityPincode;
        this.district = district;
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getCityPincode() {
        return cityPincode;
    }

    public void setCityPincode(int cityPincode) {
        this.cityPincode = cityPincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}

class EnCapsulatedMain {
    public static void main(String[] args) {
        Address stdad = new Address("kowdalpet", "adoni", 518301, "kurnool", "AP");
        Encapsulation std = new Encapsulation("Ramu", 1, 15000.00, "Intermediate", "605847586521", stdad);
        new EnCapsulatedMain().printDetails(std);
        stdad.setCity("Dhone");
        stdad.setCityPincode(510085);
        std.setSscPercentage(63);
        System.out.println("S.S.C. Percentage : " + std.getSscPercentage() + "%");
        std.setScholName("Muncipal High School");
        System.out.println("School Name : " + std.getScholName());
        System.out.println("After changing the details of city and pincode");
        stdad.setCity("Dhone");
        stdad.setCityPincode(510085);
        new EnCapsulatedMain().printDetails(std);
    }

    void printDetails(Encapsulation s) {
        System.out.println(
                s.getName() + " " + s.getRoolNo() + " " + s.getFee() + " " + s.getStandrad() + " " + s.getAadharNo()
                        + "\nAddress : " + s.getStdAddress().getStreetName() + " "
                        + s.getStdAddress().getCity() + " " + s.getStdAddress().getCityPincode() + " "
                        + s.getStdAddress().getDistrict() + " " + s.getStdAddress().getState());
    }

}