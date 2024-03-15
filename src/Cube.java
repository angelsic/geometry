public class Cube extends Square {
    public Cube(double val1){
        super(val1);
    }
    @Override
    public double getArea(){
        return 6 * Math.pow(this.val1, 2);
    }


}
