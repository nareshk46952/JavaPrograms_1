package inheritance;

//Hierarchical inheritance
public class Mobile extends Exception {
    private String color;
    private int size;
    private int numberOfCamers;
    private boolean $4gSupport;
    private boolean otg_Support;

    // Constructos
    Mobile() {
    }

    public boolean isOtg_Support() {
        return otg_Support;
    }

    public void setOtg_Support(boolean otg_Support) {
        this.otg_Support = otg_Support;
    }

    public boolean is$4gSupport() {
        return $4gSupport;
    }

    public void set$4gSupport(boolean $4gSupport) {
        this.$4gSupport = $4gSupport;
    }

    public Mobile(String color, int size, int noOfCamers, boolean $4gSupport, boolean otg_Support) {
        this(color, noOfCamers);
        this.setSize(size);
        this.set$4gSupport($4gSupport);
        this.setOtg_Support(otg_Support);
    }

    // Methods
    void perfomance() {
        System.out.println("Define mobile performance");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Mobile(String str) {
        super(str);
    }

    public Mobile(String color, int noOfCamers) {
        this.setColor(color);
        noOfCamers = numberOfCamers;
    }

}

class Redmi extends Mobile {
    private int modelNo;

    Redmi(String color, int size) {
        super(color, size);
    }

    Redmi(int model, String color, int size, int noOfCamers, boolean $4gSupport, boolean otg_Support) {
        super(color, size, noOfCamers, $4gSupport, otg_Support);
        modelNo = model;
    }

    void info() {
        System.out.println("Introduced in 2014");
    }

    void isOtgAvailble() throws Mobile {
        if (isOtg_Support())
            System.out.println("Redmi supports OTG");
        else
            throw new Mobile("Does not support OTG");
    }

    @Override
    void perfomance() {
        System.out.println("The Redmi performance is bad");
    }

}

class Oppo extends Mobile {
    public static int modelNo;

    public Oppo(int model, String color, int size, int noOfCamers, boolean $4gSupport, boolean otg_Support) {
        super(color, size, noOfCamers, $4gSupport, otg_Support);
        modelNo = model;
    }

    void isOtgAvailble() throws Mobile {
        if (isOtg_Support())
            System.out.println("Oppo supports Otg");
        else
            throw new Mobile("Does Not Support");
    }

    void is4Gsupport() throws Exception {
        if (is$4gSupport()) {
            System.out.println("Oppo supports 4G voLTE ");
        } else
            throw new Mobile("4g network is not available");
    }

    @Override
    void perfomance() {
        System.out.println("oppo Perfomance was comparatively high");
    }
}

class MainOfMobile {
    public static void main(String[] args) {
        try {
            Mobile redmi3s = new Redmi(458795, "gold", 5, 2, true, true);
            redmi3s.perfomance();
            Oppo oppo = new Oppo(875954, "blue", 6, 4, true, true);
            oppo.is4Gsupport();
            oppo.isOtgAvailble();
            oppo.perfomance();
            Redmi redmi3sprime = new Redmi(458795, "gold", 5, 2, true, true);
            redmi3sprime.perfomance();
            redmi3sprime.isOtgAvailble();
        } catch (Exception e) {
            System.out.println("Exception --> " + e);
        }
    }
}
