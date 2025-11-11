import java.util.Scanner;
public class PrintEven {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int num;
        int choice;
        int evensum = 0;
        int oddsum = 0;
        do{
            System.out.print("Enter your number : ");
            num = sk.nextInt();
            if(num% 2 == 0){
                evensum += num;
            }
            else{
                oddsum += num;
            }
            //System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sk.nextInt();
        }while(choice==1);
        System.out.println("Sum of even number :"+evensum);
        System.out.println("Sum of odd number : "+oddsum);
    }

}
