import java.util.Scanner;
public class IncomeTax {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int income = sk.nextInt();
        int tax;
        if(income<500000){
           tax = 0 ;
        }
        else if(income>=500000 && income<=1000000){
          tax = (int) (0.2 *income) ;
        }
        else{
            tax = (int) (0.3* income) ;
        }
        System.out.println("Your tax is : " + tax);


    }

    
}
