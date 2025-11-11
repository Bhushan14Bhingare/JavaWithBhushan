import java.util.Scanner;
public class Positive {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sk.nextInt();
         
        if(n>=0){
            System.out.println("This is positive number. ");
        }
        else{
            System.out.println("This is negative number. ");
        }
    }
}
