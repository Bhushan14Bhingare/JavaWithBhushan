public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return "Student [ id = "+id+" name = "+name+" marks = "+marks+"]";
    }
}
