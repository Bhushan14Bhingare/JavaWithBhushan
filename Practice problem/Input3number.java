import java.util.Scanner;
public class Input3number {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = sk.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sk.nextInt();
        System.out.print("Enter third Number : ");
        int c = sk.nextInt();
        float avg = (a+b+c)/3;
        System.out.print("Average of three number : " +avg);
    }

    
}
