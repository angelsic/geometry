public class Rectangle extends GeometricFigure{
    private double val2;
    public Rectangle(double val1, double val2) {
        super(val1);
        this.val2 = val2;
    }
    public double getVal2(){
        return val2;
    }
    public void setVal2(double val2){
        this.val2 = val2;
    }
    @Override
    public double getArea(){
        return this.val1 * this.val2;
    }
    @Override
    public double getPerimeter(){
        return 2 * (this.val1 + this.val2);
    }
}
