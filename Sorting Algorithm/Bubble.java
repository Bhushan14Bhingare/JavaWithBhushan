public class Bubble {
    public static void BubbleSorting(int arr[]){
        for(int turn = 0 ; turn < arr.length-1; turn++){
           int swap = 0;
           for(int j = 0 ; j < arr.length -1-turn;j++){
                if(arr[j] > arr[j+1]){
                int temp = arr[j+1];
                 arr[j+1] = arr[j];
                 arr[j] = temp;
                 swap++;
                }
                
            }
        }
        
    }
    public static void Array(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
       public static void main(String args[]){
        int arr[] = {1,2,3,6,5};
        BubbleSorting(arr);
        Array(arr);
    }
}
