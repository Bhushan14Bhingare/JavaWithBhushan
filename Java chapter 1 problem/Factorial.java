import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int num;
        long fact = 1;
        System.out.print("Enter a number : ");
        num = sk.nextInt();
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        System.out.println("factorial " + fact);
    }
}
