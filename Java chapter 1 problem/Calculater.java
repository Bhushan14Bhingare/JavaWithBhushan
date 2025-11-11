import java.util.Scanner;
public class Calculater {
    public static void main(String args[]){
        
        Scanner sk = new Scanner(System.in);
        
        System.out.print("Enter a first number :");
        int a = sk.nextInt();
        
        System.out.print("Enter a second number :");
        int b = sk.nextInt();

        System.out.print("Enter a operator :");
        char Operators = sk.next().charAt(0);
        
        switch (Operators){
            case '+' :System.out.println(a+b);
                       break;
            case'-' : System.out.println(a-b);
                       break;
            case'/' : System.out.println(a/b);
                       break; 
            case'*' : System.out.println(a*b);
                       break;
            case'%' : System.out.println(a%b);
                       break;
            default : System.out.println("we are not modified");                                                          
        }
        
    }

    
}
