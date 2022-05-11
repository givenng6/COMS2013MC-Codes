import java.util.ArrayList;

public class Program {



    public Point findByX(ArrayList<Point> points, int x){
        ArrayList<Point> withSameX = new ArrayList<>();
        ArrayList<Integer> myY = new ArrayList<>();

        for(int i = 0; i < points.size(); i++){
            Point curr = points.get(i);
            if(curr.XValue == x){
                withSameX.add(curr);
            }
        }

        if(withSameX.size() == 0){
            return null;
        }else {
            for(Point p : withSameX){
                int curr = p.getYValue();
                myY.add(curr);
            }

            int largestY = myY.get(0);
            int index = 0;

            for(int i = 1; i < myY.size(); i++){
                int curr = myY.get(i);
                if(curr > largestY){
                    largestY = curr;
                    index = i;
                }
            }
            return withSameX.get(index);
        }
    }

}
