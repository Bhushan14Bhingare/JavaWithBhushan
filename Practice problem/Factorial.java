import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sk.nextInt();
        long fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact *= i;            
        }
        System.out.print("Factorial is " +fact);
    }
}
