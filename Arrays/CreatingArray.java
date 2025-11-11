import java.util.Scanner;
public class CreatingArray {
    public static void main(String args[]){
        int marks[] = new int [5];

        Scanner sk = new Scanner(System.in);

        marks[0] = sk.nextInt();
        marks[1] = sk.nextInt();
        marks[2] = sk.nextInt();

        System.out.println("physics " +marks[0]);
        System.out.println("chemistry " +marks[1]);
        System.out.println("maths " +marks[2]);

    }
}
