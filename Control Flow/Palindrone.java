import java.util.Scanner;
public class Palindrone {
    public static void main(String args[]){
         Scanner sk = new Scanner(System.in);

         System.out.print("Enter the number : ");
         int n = sk.nextInt();
         int reverse = 0;
         int num = n;

         while(num > 0){
            int remainder = num % 10;
             reverse = reverse * 10 + remainder;
            num = num / 10 ;
        }
        if(n == reverse){
            System.out.print(n +" is a palindrome number.");
            }
        else{
            System.out.print(n + " is not a palindrome number.");
        }    

    }
}