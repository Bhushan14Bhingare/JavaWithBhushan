import java.util.Scanner;
public class ProductData {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter value a :");
        int a = sk.nextInt();
        System.out.print("Enter value b :");
        int b = sk.nextInt();
        int product = a*b;
        System.out.println(product);
    }
}