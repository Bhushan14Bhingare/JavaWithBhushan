import java.util.Scanner;
public class Array
 {
    public static void main (String []args){
        int a[]=new int [3];
        int sum=0;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Element in Array");
        for (int i=0; i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
            System.out.println("Array elements");
            for (int i=0; i<a.length;i++)
            {
                System.out.println(a[i]+" ");
                sum=a[i]+sum;

            }
            System.out.println("Addition of array element " +sum);

        }
    }