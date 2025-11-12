import java.util.Scanner;
public class Voting {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        
        System.out.println("Enter a age :");
        int n = sk.nextInt();

        if(n>18){
            System.out.println("It is a eligible to votting");
        }
        else{
            System.out.println("It is not a eligible to votting");
        }
        sk.close();
    }
}
