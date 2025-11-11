import java.util.Scanner;
public class TechNumber {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);

        System.out.print("Enter tech number :");
        int num = sk.nextInt();
        int digit = 0;

        while(num != 0){
            digit ++;
            num = num / 10;
        }
        System.out.println("Number of digit :"+digit );
        for(int i = 1000 ; i <= 9999 ; i++){
            int secondhalf = i % 100;
            
            int firsthalf = i / 100;
                    
            int sum = firsthalf + secondhalf ;
        
            if(i==sum*sum){
            
            System.out.println("Square of tech number " + i);
            }
        }
        
    }
}
