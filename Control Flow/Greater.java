import java.util.Scanner;
public class Greater {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sk.nextInt();

        System.out.print("Enter the second number : ");
        int b = sk.nextInt();

        System.out.print("Enter the third number : ");
        int c = sk.nextInt();

        if((a >= b) && (a >= c)){
            System.out.println("A is greater number ");
        }
        else if(b >= c){
            System.out.println("B is a greater number ");
        }
        else{
            System.out.println("C is a greater number");
        }
        }
}
