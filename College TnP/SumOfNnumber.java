import java.util.Scanner;
public class SumOfNnumber {
        public static void main(String args[]){
            Scanner sk = new Scanner(System.in);

            System.out.print("Enter a natural number = ");
            int num = sk.nextInt();
            int sum = 0;
            for(int i = 1 ; i <= num; i++){
            sum = sum + i;
        }
           System.out.print(sum);
    }
}
