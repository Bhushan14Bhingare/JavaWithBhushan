public class Prob2 {
    public static void SelectionSorting(int arr[]){
        for(int i = 0 ; i < arr.length -1 ; i++){
            int curr = i;
            for(int j = i+1; j < arr.length ; j++){
                  if(arr[j] > arr[curr]){
                    curr = j;
                  }
            }
            int temp = arr[curr];
            arr[curr] = arr[i];
            arr[i]= temp; 
        }
    }
    public static void Array(int arr[]){
        for(int i =0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] ={3,6,2,1,8,7,4,5,3,1};
        SelectionSorting(arr);
        Array(arr);
            
    }
}
