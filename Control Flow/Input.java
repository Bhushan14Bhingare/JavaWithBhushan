import java.util.Scanner;
public class Input {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter a first float number : ");
        float a = sk.nextFloat();

        System.out.print("Enter a second float number : ");
        float b = sk.nextFloat();

        if(a == b){
            System.out.println("IT IS A SAME");
        }
        else{
            System.out.println("They are different");
        }
    }
}
