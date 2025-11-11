import java.util.Scanner;
public class Even {
    public static boolean IsEven(int n)
    {
        if(n % 2 == 0){
            return true;
            
        }
        else{
            return false;
            
        }
    }
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
         System.out.print("Enter a integer :");
         int n = sk.nextInt();
         if(IsEven(n)){
            System.out.println("Number is Even");
         }
         else{
            System.out.println("Number is Odd");
         }
         System.out.println(IsEven(n));
    }
}
