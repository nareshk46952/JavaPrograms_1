public class Oops implements Cloneable {
    private int id;
    private String name;
    private long mobNo;
    private double salary;
    private String dob;
    public Oops(int id, String name, long mob, double salary, String dob) {
        this.id = id;
        this.name = name;
        mobNo = mob;
        this.salary = salary;
        this.dob = dob;
    }

    public Oops(Oops obj) {
        id = obj.id;
        name = obj.name;
        mobNo = obj.mobNo;
        salary = obj.salary;
        dob = obj.dob;
    }

    public String toString() {
        return "id " + id + " name " + name + " mobNo " + mobNo + " salary " + salary + " Dob " + dob;
    }
}

class test {
    public static void main(String[] args) {
        Oops ob = new Oops(1011, "naresh", 897774695, 20400.525, "15/08/1996");
        Oops cObj = new Oops(ob);
        System.out.println(ob.toString());
        System.out.println("Printing Copy Constructor");
        System.out.println(cObj.toString());
        Oops obj1 = cObj;
        System.out.println("Printing another Copy Constructor");
        System.out.println(obj1.toString());
        Cloneable c = new Oops(1022, "Ramu", 965279485, 10000.25, "08/08/1996");
        System.out.println("Printing another Copy Constructor by using Cloneable Interface");
        System.out.println(c.toString());
    }
}
