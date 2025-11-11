import java.util.Scanner;
public class Dudency {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a positive Integer =");
        int num = sk.nextInt();
         
         
         int cubeRoot = (int)(Math.cbrt(num));
         System.out.println("CUBE ROOT : " +cubeRoot);

         if (cubeRoot * cubeRoot * cubeRoot == num){
            int sumofdigit = 0;
            int n = num;
               while(n > 0){
                    
                    int lastdigit = n% 10;
                    sumofdigit += lastdigit ;
                    n /= 10;
                    }
                    System.out.println("Number of Digit = "+ sumofdigit);

                    if(sumofdigit == cubeRoot)
                    {
                       System.out.println("It is a Dudency Number.");
                    }else{
                    System.out.println("It is not a Duudency Number");
                    }
            
         } else {
            System.out.println("It is not a Dudency");
         
            }       
        }
    }

