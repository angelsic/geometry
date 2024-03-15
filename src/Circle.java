public class Circle extends GeometricFigure {
    public Circle(double val1){
        super(val1);
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(this.val1, 2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * this.val1;
    }
}
