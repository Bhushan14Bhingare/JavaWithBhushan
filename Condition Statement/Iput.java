import java.util.Scanner;
public class Iput {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a age :");
        int age = sk.nextInt();
        if (age > 18){
            System.out.println("This is Adult");
        }
        else if (age >=13 && age <=18){
            System.out.println("This is teenager");
        }
        else
        {
            System.out.println("This is child");
        }
        
    }
    
}
