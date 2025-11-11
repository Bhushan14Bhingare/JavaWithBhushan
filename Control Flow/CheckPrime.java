import java.util.Scanner;
public class CheckPrime {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Input number :");
        int  n = sk.nextInt();

        
        if(n % 2 == 0){
                System.out.println(n +" is not a prime number");
            }
        else{
                System.out.println(n +" is a prime number");
            }
    }
}
