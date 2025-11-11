import java.util.Scanner;
public class CostPrice {
    public static void main(String args[]){
        Scanner sk = new Scanner (System.in);

        System.out.print("Enter a cost price : ");
        int CP = sk.nextInt();

        System.out.print("Enter a selling price : ");
        int SP = sk.nextInt();

        // Formula Profit = selling price - cost price
        // Loss = Cost price - Selling price

        int profit =  SP - CP ;
        int loss = CP - SP ;

        if(profit > loss){
            System.out.println(+ profit + " profit ");
        }
        else{
            System.out.println(+ loss + " loss ");
        }
    }
}
