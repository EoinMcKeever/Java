
public class Square extends Shape{

    protected double sideLength;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void getArea() {
        System.out.println(Math.pow(sideLength,2));
    }

    @Override
    public void getPerimeter() {
        System.out.println(sideLength*4);
    }
}
