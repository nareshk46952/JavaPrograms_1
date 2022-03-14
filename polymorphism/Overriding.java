public class Overriding {
    public static String address(String city) {
        return city;
    }

    public String adderss(String city, String district) {
        return "City : " + city + "\nDistrict: " + district;
    }

    public double salary(double salary, double pf) {
        return salary - pf;
    }
}

class Riding extends Overriding {
    public static String address(String country) {
        return country;
    }

    public static String address() {
        return address("");
    }

    @Override
    public double salary(double salary, double pf) {
        return salary - pf + 1250.0;
    }
}

class Main {
    public static void main(String[] args) {
        Overriding obj = new Riding();
        String ad = obj.adderss("Adoni", "Kurnool");
        System.out.println(ad);
        System.out.println(Overriding.address("gudiwada"));
        // invoking salary method
        System.out.println(obj.salary(12500, 125));
        Overriding obj1 = new Overriding();
        System.out.println(obj1.salary(12500, 125));
    }

}
// conculsion:: the static methods are not able to override;