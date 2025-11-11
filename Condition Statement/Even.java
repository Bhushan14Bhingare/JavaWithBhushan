import java.util.Scanner;
public class Even {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int number = sk.nextInt();
        if(number%2==0){
            System.out.println("Even");
        } 
        else{
            System.out.println("Odd");
        }
    }
    
}
