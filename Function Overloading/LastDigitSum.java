import java.util.Scanner;
public class LastDigitSum {
    public static int LastDigit(int n){
        int sumofdigit = 0;
        while(n > 0){
            int lastdigit = n % 10;
            sumofdigit += lastdigit;

            n /= 10;
        }
        return sumofdigit;
    }
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Input the integer :");
        int n = sk.nextInt();

        System.out.println(LastDigit(n));
         
    }
}
