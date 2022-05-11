public class Point {
    int XValue;
    int YValue;

    public Point(int x, int y){
        this.YValue = y;
        this.XValue = x;
    }

    public int getXValue(){
        return XValue;
    }

    public int getYValue() {
        return YValue;
    }


    public boolean isTheSameAs(Point other){

        return this.equals(other);
    }
}
