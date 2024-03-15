public class Square extends GeometricFigure {

    public Square(double val1){
        super(val1);
    }

    @Override
    public double getArea(){
        return Math.pow(this.val1, 2);
    }

    @Override
    public double getPerimeter(){
        return this.val1*4;
    }
}
