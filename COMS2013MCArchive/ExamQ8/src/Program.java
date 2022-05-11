import java.util.ArrayList;

public class Program {



    public static void badDays(ArrayList<String> attendance){
        ArrayList<Integer> number = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < attendance.size(); i++){
            String dayI = attendance.get(i);
            String[] splitAll = dayI.split(",");
            int total = splitAll.length;
            sum = sum + total;
            number.add(total);
        }

        double average = (double)sum / attendance.size();

        for(int i = 0; i < number.size(); i++){
            int attend = number.get(i);
            if(attend < average){
                System.out.println(i);
            }
        }
    }
}
