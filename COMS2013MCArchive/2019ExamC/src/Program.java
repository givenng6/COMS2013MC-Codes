import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String args[]){
        Program p = new Program();
        String[] stu = {"steven,ritesh,hima,benji", "pravesh", "sigrid,richard,turgay", "clint,dmitry"};
        String[] mark = {"90", "45", "80", "85"};
        ArrayList<String> a = new ArrayList<>(Arrays.asList(stu));
        ArrayList<String> b = new ArrayList<>(Arrays.asList(mark));

        p.groupMarker(a, b);
    }

    public void groupMarker(ArrayList<String> a, ArrayList<String> b){
        ArrayList<Integer> people = new ArrayList<>();
        int total = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++){
            String list = a.get(i);
            String[] items = list.split(",");
            int num = items.length;
            people.add(num);
        }

        for(int i = 0; i < b.size(); i++){
            int mark = Integer.parseInt(b.get(i));
            total = total + (mark * people.get(i));
            sum = sum + people.get(i);
        }

        System.out.println((double) total / sum);
    }


}
