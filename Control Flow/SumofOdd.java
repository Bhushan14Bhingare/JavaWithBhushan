import java.util.Scanner;
public class SumofOdd {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int sum = 0;
        int i ;
        int n;
        
        System.out.print("Inputs n terms :");
         n = sk.nextInt();
         System.out.println("The odd number is : ");

        for( i = 1 ; i <= n ; i++){
            System.out.println(2 * i - 1);
            sum += 2 * i -1;
        }
       
        System.out.println("The sum of the odd natural number  "+n+" term is "+sum);
    }
}
