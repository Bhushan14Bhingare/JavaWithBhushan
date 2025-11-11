import java.util.Scanner;
public class Weak {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        
        System.out.print("Enter the weak days number (1-7) :");
        int weak = sk.nextInt();

        switch (weak){
            case 1 : System.out.println("monday");
                      break;
            case 2 : System.out.println("Tuesday");
                      break;
            case 3 : System.out.println("Wednesday");
                      break;
            case 4  : System.out.println("Thusday");
                      break;
            case 5 : System.out.println("Friday");
                      break;
            case 6 : System.out.println("Satuarday");
                      break;
            case 7  : System.out.println("Sunday");
                      break;
            default : System.out.println("Invalid input please enter the weak number between (1-7)");                                                   
        }
    }
    
}
