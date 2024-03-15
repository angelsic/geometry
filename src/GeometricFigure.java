public abstract class GeometricFigure {
    protected double val1;
    public GeometricFigure(double val1){
        super();
        this.val1 = val1;
    }
    public double getVal1() {
        return val1;
    }
    public void setVal1(double val1) {
        this.val1 = val1;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

}
