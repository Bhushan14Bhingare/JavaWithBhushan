import java.util.Scanner;
public class Entervalidyear {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = sk.nextInt();
         boolean x = (year % 4) == 0;
         boolean y = (year % 100) != 0;
         boolean z = ((year % 100 == 0) && (year % 400 == 0));
         if(x && (y||z)){
            System.out.println("This is a leap year");
         }
         else{
            System.out.println("This is not a leap year");
         }
    }
}
