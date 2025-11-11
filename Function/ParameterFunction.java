import java.util.Scanner;
public class ParameterFunction {
    public static char calculate(int a, int b){
        int sum =(char )(a + b) ;
        return 4;

    }
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int a = sk.nextInt();
        int b = sk.nextInt();
        char sum = calculate( a, b);
        System.out.println(sum);
    }
}
