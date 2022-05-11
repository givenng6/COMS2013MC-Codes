public class Program {

    public void d(Student one, Student two){
        int mark1 = one.getMark();
        System.out.println(one.getName()+" got "+mark1);
        if (one.beats(two)){
            System.out.print("The person named ");
            System.out.print(one.getName() + " has a higher mark than ");
            System.out.println(two.getName());
        }
    }
    public Student makeStudent(String name, int mark){
        return new Student(name, mark);
    }
}
