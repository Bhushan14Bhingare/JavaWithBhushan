import java.util.Scanner;
public class If {
    public static void main(String args[]) throws Exception{
        Scanner sk = new Scanner(System.in);
        int age = sk.nextInt();
        
        
        if( age > 18){
            System.out.println("This is eligible to votting");
        }
        else
        {
            System.out.println("This is not eligible to votting");
        }
    }
    
}
