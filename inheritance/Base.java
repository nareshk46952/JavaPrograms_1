package inheritance;

public class Base {
    // attributes of Base class
    private int empNumber;
    private String name;
    final double salary = 25000.725;
    final double pf = 1025.48;
    private String phoneNumber;

    // parameterized construtor
    public Base(int empNumber, String name, String phNumber) {
        phoneNumber = phNumber;
        this.name = name;
        this.empNumber = empNumber;
    }

    // setter methods
    public void setBaseNumber(int num) {
        empNumber = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String number) {
        phoneNumber = number;
    }

    // getter methods
    public int getBaseNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "" + empNumber + " " + name + " " + phoneNumber + " " + (salary - pf);
    }
}

class SubBase extends Base {
    private String empCity;
    private String empState;
    private String empDistrict;
    private String empCountry;

    public SubBase(int empNum, String name, String phoneNumber, String city, String state, String dist,
            String country) {
        super(empNum, name, phoneNumber);
        empCity = city;
        empState = state;
        empDistrict = dist;
        empCountry = country;
    }

    // Setters
    public void setEmpCity(String city) {
        empCity = city;
    }

    public void setEmpState(String state) {
        empState = state;
    }

    public void setEmpDistrict(String dist) {
        empDistrict = dist;
    }

    public void setEmpCountry(String coutry) {
        empCountry = coutry;
    }

    // Getters
    public String getEmpCity() {
        return empCity;
    }

    public String getEmpState() {
        return empState;
    }

    public String setEmpDistrict() {
        return empDistrict;
    }

    public String getEmpCountry() {
        return empCountry;
    }

    @Override
    public String toString() {
        // invoking Base toStrigMethod
        String baseStr = super.toString();
        String subBaseStr = "" + empCountry + " " + empState + " " + empDistrict + " " + empCity;
        return baseStr + "\nAddress : " + subBaseStr;
    }
}

class Main {
    static int count = 1010;

    public static void main(String[] args) {
        // Compile-Time Polymorphism
        Base emp = new Base(count++, "naresh", "8977746952");
        // System.out.println(emp);
        // Run-Time Polymorphism
        Base emp2 = new SubBase(count++, "ramu", "9652793739", "Adoni", "Andhra Pradesh", "Kurnool", "India");
        System.out.println(emp2);
        // Compile-time Polymorphism
        SubBase emp3 = new SubBase(count++, "kashi", "9553406364", "Adoni", "Andhra Pradesh", "Kurnool", "India");
        System.out.println(emp3);
    }
}
