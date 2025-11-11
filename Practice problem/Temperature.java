import java.util.Scanner;
public class Temperature {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a temperature ");
        double temp = sk.nextDouble();
        if(temp >= 100){
            System.out.println("YOU HAVE A FEVER");
        }
        else{
            System.out.println("YOU HAVE NOT A FEVER ");
        }
    }
}
