public class Triangle extends GeometricFigure{
    private double val2;
    private double val3;
    public Triangle(double val1, double val2, double val3){
        super(val1);
        this.val2 = val2;
        this.val3 = val3;
    }
    public double getVal2(){
        return this.val2;
    }
    public void setVal2(double val2){
        this.val2 = val2;
    }
    public double getVal3(){
        return this.val3;
    }
    public void setVal3(double val3){
        this.val3 = val3;
    }
    @Override
    public double getArea(){
        return (this.val1 * this.val2) / 2;
    }
    @Override
    public double getPerimeter(){
        return this.val1 + this.val2 + this.val3;
    }
}
