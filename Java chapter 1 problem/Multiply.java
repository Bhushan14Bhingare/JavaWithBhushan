import java.util.Scanner;
public class Multiply {
    public static void main(String args[]){
        Scanner sk = new Scanner (System.in);
        System.out.print("Enter your Number : ");
        int n = sk. nextInt();
        for(int i = 1; i <= 10 ; i++){
            System.out.println(n + "*" + i + "=" + n*i );
        }
    }
}
