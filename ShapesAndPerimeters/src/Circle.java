public class Circle extends Shape {

    protected final double PI = 3.141592653589793238462643;
    protected double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(PI * Math.pow(radius,2));
    }

    @Override
    public void getPerimeter() {
        System.out.println(2 * PI * radius);
    }
}
