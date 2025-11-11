import java.util.Scanner;
public class SumNnumber {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sk.nextInt();
        int sum = 0;
        int i = 1;

        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("sum is :" + sum );
    }
}
