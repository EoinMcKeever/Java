
abstract class Shape {

    protected String color;


    public Shape(String color) {
        this.color = color;
    }

    public void getArea() {
    }

    public void  getPerimeter() {
    }

    public static void main(String[] args){
        Square square = new Square("red", 5);
        square.getArea();
        square.getPerimeter();
        System.out.println(square.color);
        Rectangle rectangle = new Rectangle("red", 5, 3);
        rectangle.getArea();
        rectangle.getPerimeter();
        System.out.println(rectangle.color);
        Triangle triangle = new Triangle("red", 10, 10 ,10);
        triangle.getArea();
        triangle.getPerimeter();
        Circle circle = new Circle("red",5);
        circle.getArea();
        circle.getPerimeter();



    }
}
