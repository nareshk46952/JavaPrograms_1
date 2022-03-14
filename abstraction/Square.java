public class Square extends Shape {
    public static void main(String[] args) {
        int a = 10, b = 20;
        //accessing methods with Abstact class Refernce.
        Shape s = new Square();
        s.area();
        System.out.println(s.area(a, b) + " Sq.m");
        System.out.println(s.getVolumeOfSquareOrRectangle(a, b, 10) + " Cu.m");
    }
    @Override
    int sides() {
        return 4;
    }
    @Override
    String name() {
        return "Square";
    }
    @Override
    int area(int a, int b) {
        return a * b;
    }
    @Override
    int getCircleArea(int r) {
        return 0;
    }
}
