import java.util.Scanner;
public class NotPrintMul10 {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
       
        do{
            System.out.print("Enter a number : ");
            int n = sk.nextInt();
            if(n%10==0){
                continue;
            }        
        System.out.println(n);
        }while(true);        
    }
}
