import java.util.Scanner;
public class SumEven {
    public static void main(String args[]){
        Scanner sk = new Scanner (System.in);
        int num;
        int choice;
        int sumeven = 0;
        int sumodd = 0;
        do {
            System.out.print("Enter a number : ");
            num = sk.nextInt();

            if(num%2 == 0){
                sumeven += num;
            }
            else{
                sumodd += num;
            }
            
        
        System.out.print("please choice between 0 and 1 , for 1 is a continue the program and 0 is a exit the program : ");
        choice = sk.nextInt();
    }while(choice == 1);

        System.out.println("add the all even number " +sumeven);
        System.out.println("add the all odd number " +sumodd);
    }
}
