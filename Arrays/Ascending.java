import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Ascending Order : "+Arrays.toString(arr));
        sc.close();
    }
}
