import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String args[]){
        Program program = new Program();
        program.processInput();
    }

    public void processInput(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            int input = sc.nextInt();
            numbers.add(0, input);
            if(numbers.size() >= 2){
                if(input == numbers.get(1)){
                    break;
                }
            }
        }

        int sum = 0;
        for(int num : numbers){
            sum = sum + num;
        }

        System.out.println((double) sum / numbers.size());
    }
}
