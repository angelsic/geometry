public class Main {
    public static void main(String[] args) {


        GeometricFigure square = new Square(10.0);
        Square cube = new Cube(10.0);
        GeometricFigure triangle = new Triangle(10.0,10.0,10.0);
        GeometricFigure circle = new Circle(10.0);
        GeometricFigure rectangle = new Rectangle(10.0,10.0);

        System.out.println("Square area =" + square.getArea());
        System.out.println("Square perimeter =" + square.getPerimeter());

        System.out.println("Triangle area =" + triangle.getArea());
        System.out.println("Triangle perimeter =" + triangle.getPerimeter());

        System.out.println("Circle area =" + circle.getArea());
        System.out.println("Circle perimeter =" + circle.getPerimeter());

        System.out.println("Rectangle area =" + rectangle.getArea());
        System.out.println("Rectangle perimeter =" + rectangle.getPerimeter());

        System.out.println("Cube area =" + cube.getArea());


    }
}