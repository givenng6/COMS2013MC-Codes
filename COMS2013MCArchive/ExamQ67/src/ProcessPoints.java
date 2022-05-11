public class ProcessPoints {

    public void getPoints(){
        Point p = new Point(10,20);
        Point r = new Point(50,10);

        int x = p.getXValue();
        int y = p.getYValue();

        if (p.isTheSameAs(r)){
            System.out.println("p is the same as r");
        }
    }
}
