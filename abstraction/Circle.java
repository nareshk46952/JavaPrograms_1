public class Circle extends Shape {

    @Override
    int sides() {
        
        return 0;
    }

    @Override
    String name() {
        
        return "Circle";
    }

    @Override
    int area(int a, int b) {
        return 0;
    }
    @Override
    int getCircleArea(int r) {
        return (int)Shape.pi * r * r ;
    }
    public static void main(String[] args) {
        Shape s = new Circle();
        System.out.println(s.getCircleArea(5));
    }
}
