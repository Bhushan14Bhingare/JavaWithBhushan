import java.util.Scanner;
public class MenuAdd {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.print("Click 1 for add and 2 for substract : ");
            int menu = sk.nextInt();
            
              switch (menu) {
                  case 1: System.out.print("Enter a first number : ");
                        int a = sk.nextInt();

                        System.out.print("Enter a Second number : ");
                        int b = sk.nextInt();

                        int add = a + b;
                        System.out.println("Sum of " +a + "+" +b+ ":" +add);
                    
                    break;
                  case 2: System.out.print("Enter a first number :");
                        int c = sk.nextInt();
                        
                        System.out.print("Enter the second number :");
                        int d = sk.nextInt();

                        int sub = c - d;
                        System.out.println("Subtract of "+c+ "-"+d+":" +sub);
                    break;    
            
                  default:
                        
                    break;
            }
               System.out.println("Do you want Contiue 1 or not 0");
               choice = sk.nextInt();
        }      while(choice == 1);

    }
}
