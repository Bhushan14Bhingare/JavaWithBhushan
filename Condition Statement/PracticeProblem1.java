import java.util.Scanner;
public class PracticeProblem1 {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = sk.nextInt();
        
        if(number > 0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
}
