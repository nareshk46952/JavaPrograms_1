abstract class Shape {
    abstract int sides();
    abstract String name();
    final static double pi = 3.14;
    abstract int getCircleArea(int r);
    void area(){
        System.out.println("Here your getting an area");
    }
    abstract int area(int a, int b);
    int getVolumeOfSquareOrRectangle(int a, int b ,int len){
        return area(a,b)*len;
    }
}
