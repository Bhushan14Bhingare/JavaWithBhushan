import java.util.Scanner;

public class StudentArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter a size of an array : ");
       int size = Integer.parseInt(sc.nextLine());

       Student s1[] = new Student[size];

       for(int i = 0 ; i < s1.length ; i++){
        System.out.print("Enter a student id : ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter a student name : ");
        String name = sc.nextLine();

        System.out.print("Enter a Student marks : ");
        int marks = Integer.parseInt(sc.nextLine());


        s1[i] = new Student(id,name,marks);
       }

       for(Student x : s1){
        System.out.println(x);
       }
       sc.close();
    }
}
