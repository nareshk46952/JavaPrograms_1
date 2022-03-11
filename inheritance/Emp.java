package inheritance;

public class Emp implements Employee {
    private String name;
    private int empId;
    private double salary;
    private String joiningDate;
    private String standard;
    private int rank;

    public Emp(String name, int empId, double salary, String joiningDate, String standard, int rank) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.standard = standard;
        this.rank = rank;
    }

    @Override
    public void method1() {
        System.out.println("This is from interface1");
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSalary() {

        return salary;
    }

    @Override
    public String getJOingDate() {

        return joiningDate;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public String getStandard() {
        // TODO Auto-generated method stub
        return standard;
    }

    @Override
    public int getRank() {
        // TODO Auto-generated method stub
        return rank;
    }

    @Override
    public int getEmpid() {
        // TODO Auto-generated method stub
        return empId;
    }

    @Override
    public String toString() {
        return "" + name + " " + empId + " " + salary + " " + standard + " " + rank;
    }

}

class EmpOfMain {
    public static void main(String[] args) {
        try {
            Employee e1 = new Emp("Rakesh", 1211, 30000.520, "16/09/2020", "B.Tech", 1);
            System.out.println("            \tEmployee Interface details               ");
            System.out.println("Name " + e1.getName());
            System.out.println("Employee " + e1.getEmpid());
            System.out.println("Salary " + e1.getSalary());
            System.out.println("Joing date " + e1.getJOingDate());
            System.out.println("Standard " + e1.getStandard());
            System.out.println("Rank " + e1.getRank());
            System.out.println("----------->Total Details<-----------------");
            System.out.println(e1);
            System.out.println("--------------------------------------------");
            StudenetDetails s1 = new Emp("Veera", 1458, 45180.265, "19/12/2014", "MCA", 12);
            System.out.println("            \tStuentDetails Interface details               ");
            System.out.println("Name " + s1.getName());
            System.out.println("Rank " + s1.getRank());
            System.out.println("Standard " + s1.getStandard());
            System.out.println("----------->Total Details<-----------------");
            System.out.println(s1);
            System.out.println("--------------------------------------------");
            Details e2 = new Emp("Jogendra", 1054, 25480.520, "16/09/2021", "B.Com", 8);
            System.out.println("            \tDetails Interface details               ");
            e2.method1();
            System.out.println("----------->Total Details<-----------------");
            System.out.println(e2);
            System.out.println("--------------------------------------------");
        } catch (Exception e) {
            System.out.println("Exception --> " + e);
        }
    }
}
