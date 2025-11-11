import java.util.Scanner;
public class Palindrome {
    public static boolean Ispalindrome(int num){
        int palindrome = num;
        int reverse = 0;
        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder ;
            palindrome = palindrome / 10; 
        }
        if(num == reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sk.nextInt();

        if(Ispalindrome(num)){
            System.out.println("Number :" + num +" is a palindrome.");
        }
        else{
            System.out.println("Number :" + num + " is not a palindrome.");
        }
        System.out.println(Ispalindrome(num));

    } 
}
