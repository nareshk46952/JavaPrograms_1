public class Overloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(int a, double b) {
        return a + b;
    }

    public String add(String fName, String lName) {
        return fName + " " + lName;
    }

    public String add(String fname, double salary) {
        return fname + " " + salary;
    }

    public static int add(double a, int b) {
        return (int) a + b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        // Invoking a String method.
        System.out.println(obj.add("Naresh", "kuruva"));
        // Invoking a String method with different parameters
        System.out.println(obj.add((obj.add("Ramu", "kuruva")), 28000.525));
        System.out.println(add(20.4, 95));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30));
    }
}