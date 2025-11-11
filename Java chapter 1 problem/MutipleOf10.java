import java.util.Scanner;
public class MutipleOf10 {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        do{
            System.out.print("Enter a Number : ");
            int n = sk.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
