import java.util.Scanner;
public class Reverse {
        public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
         
        System.out.print("Enter the input number :");
        int num = sk.nextInt();
        int reverse = 0;
        int newnum = num;

        while(newnum != 0){
            int lastdigit = newnum % 10;
            reverse = reverse * 10 + lastdigit;
            newnum = newnum / 10;
            
        }
        int diff = reverse - num ;
         System.out.println("Absoulte Difference : " +Math.abs(diff));
        System.out.println("Reverse Number is :" +reverse);
        
    }
}
