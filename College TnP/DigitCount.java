import java.util.Scanner;
public class DigitCount {
    public static void main (String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter the Number =");
        int num = sk.nextInt();

        int digit = 0;

        while(num != 0){
            digit ++;
            num = num / 10;
        }            
            System.out.println("The number of digit is " +digit);
        if (digit % 2 == 0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is odd number");
        }
    }
}
