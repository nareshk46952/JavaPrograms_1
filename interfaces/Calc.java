package interfaces;

public interface Calc {
    public int getAreaOfRectOrSquare(int l, int b);

    public String getFullName(String fName, String lName);
}

interface Interface2 {
    public String getCity();

    public void m1();
}

// multiple inheritance

interface Interface3 extends Interface2, Calc {
    public String phonenumString(String str);

    public double getbalnce();
}

class DetailsOfEmp implements Interface3 {
    private String fname;
    private String lname;
    private String city;
    private String phNum;
    private double amount;

    // Constructor
    public DetailsOfEmp(String fname, String lname, String city, String phNum, double amount) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.phNum = phNum;
        this.amount = amount;
    }

    public String getFname() {
        return fname;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPhNum() {
        return phNum;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void m1() {
        System.out.println("This m1() form interface 2");
    }

    @Override
    public String getFullName(String fName, String lName) {
        return fName + " " + lName;
    }

    @Override
    public String phonenumString(String str) {
        return this.phNum = str;
    }

    @Override
    public double getbalnce() {
        double amount = this.amount - 1250;
        if (amount >= 0) {
            return amount;
        } else
            return 0;
    }

    @Override
    public int getAreaOfRectOrSquare(int l, int b) {
        // TODO Auto-generated method stub
        return 0;
    }
}

class CalcMain {
    public static void main(String[] args) {
        try {
            DetailsOfEmp emp = new DetailsOfEmp("Raju", "Kuruva", "Adoni", "8977746952", 25000);
            System.out.println("Name :" + emp.getFullName(emp.getFname(), emp.getLname()));
            System.out.println("City : " + emp.getCity());
            System.out.println("Phone number : " + emp.getPhNum());
            System.out.println("Balance : " + emp.getbalnce());
            // printing details by using interface reference
            Interface3 em = new DetailsOfEmp("Kashi", "Golla", "Adoni", "9652793739", 31000);
            System.out.println("City : " + em.getCity());
            System.out.println("Name :" + em.getFullName("Kashi", "Golla"));
            System.out.println("Balance : " + em.getbalnce());
            System.out.println("Class name : " + em.getClass().getSimpleName());
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}
