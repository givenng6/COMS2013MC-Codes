public class Student {

    private int mark;
    private String name;


    public Student(String name, int mark){
        this.mark = mark;
        this.name = name;
    }

    public int getMark(){
        return mark;
    }

    public String getName(){
        return  name;
    }

    public boolean beats(Student student){

        return true;
    }
}
