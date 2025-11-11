import java.util.Scanner;
public class Goldbach {
    public static boolean primeno(int n){
        int count=0;
        for(int i=2;i<=n/2+1;i++){
            if(count>0){
                return false;
            }
            if(n%i==0){
                count++;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the N");
        n=sc.nextInt();
        if(n>50 || n<9){
            System.out.println("NO.is out of range");
        }
        else if(n%2==1){
            System.out.println("No. is odd");
        }
        else{
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n-2;i++){
            if(primeno(i+2)){
                arr[count]=i+2;
                count++;
            }
        }
        System.out.println(count);
        
        int start=0,end=count-1;
        while(start<=end){
            if(arr[start]+arr[end]==n){
                System.out.println(arr[start]+" "+arr[end]);
                start++;
                end--;
            }
            else if(arr[start]+arr[end]>n){
                end--;
            }else{
                start++;
            }
        }
    }
    }
}

