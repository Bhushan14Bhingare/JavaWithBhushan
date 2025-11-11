import java.util.Scanner;
public class GCD {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter a first number = ");
        int a = sk.nextInt();

        System.out.print("Enter a second number =");
        int b = sk.nextInt();

        while( b != 0){
            int remainder = b;
             remainder  = a % b;
            a = remainder ;
            System.out.print("GCD = "+ a);
            break ;
        }
    }
}
