import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length;i++){
            for(int j = arr[i]+1; j<arr[i+1]; j++){
                System.out.print(j+" ");
            }
        }
    }
}
