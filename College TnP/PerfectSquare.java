import java.util.Scanner;
public class PerfectSquare {
    public static boolean checkPerfectSquare(double number){
        double sqrt = Math.sqrt(number);
    
    return((sqrt - Math.floor(sqrt))==0);
    }

    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter a number : ");
        double number = sk.nextDouble();

        if(checkPerfectSquare(number)){
            System.out.println("The givien number is a perfect square");
        }
        else{
            System.out.println("This is givien number is not a perfect square");
        }


    }
}
