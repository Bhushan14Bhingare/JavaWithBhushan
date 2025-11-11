import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        int reverse = 0;
        while (n>0) {
            int remainder = n % 10;           
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
          
        System.out.println(reverse);
        }
        
    }

