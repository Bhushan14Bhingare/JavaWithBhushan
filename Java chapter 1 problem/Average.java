import java.util.Scanner;
public class Average {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int a = sk.nextInt();
        int b = sk.nextInt();
        int c = sk.nextInt();
        int avg = (a + b + c)/3;
        System.out.println(avg);
    }
    
}
