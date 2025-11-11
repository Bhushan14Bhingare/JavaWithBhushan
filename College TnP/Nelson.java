import java.util.Scanner;
public class Nelson {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sk.nextInt();
        
          if(num % 111 == 0){
            System.out.println( + num +" is a nelson number");
          }
          else{
            System.out.println(+ num + " is a not nelson number");
          }
    }
}
