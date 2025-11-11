import java.util.Scanner;
public class Average {
    public static int average(int a,int b,int c){
        return (a + b +c) /3;
    }
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter a first number :");
        int a = sk.nextInt();
        
        System.out.print("Enter a second number :");
        int b = sk.nextInt();

        System.out.print("Enter a third number :");
        int c = sk.nextInt();

        System.out.println("The average of three numbers :" + average(a,b,c));
    }
}
