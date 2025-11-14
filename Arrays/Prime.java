import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0 ; i < arr.length; i++){
           arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i <arr.length; i++){
            int count = 0;
            for(int j = 1 ; j <= arr[i]; j++){
                if(arr[i] % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
