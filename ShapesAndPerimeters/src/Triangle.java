import static java.lang.Math.sqrt;

public class Triangle extends Shape{

    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }



    @Override
    public void getArea() {
        double area = 0.25 * (sqrt((side1+side2+side3)*(side2-side1+side3)*(side1-side2+side3)*(side1+side2-side3)));
        System.out.println(area);
    }

    @Override
    public void getPerimeter() {
        System.out.println(side1 + side2 + side3);
    }
}
