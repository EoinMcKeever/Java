public class Rectangle extends Shape {

    protected double length;
    protected double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println(length * width);
    }

    @Override
    public void getPerimeter() {
        System.out.println((length*2) + (width*2));
    }
}
