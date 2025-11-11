public class Selection {
    public static void SelectionSorting(int arr[]){
        for(int turn = 0 ; turn < arr.length - 1 ; turn++){
            int curr = turn;
            for(int j = turn+1 ; j < arr.length ; j++){
                if(arr[j] > arr[curr]){
                    curr = j;
                }
            }
            int temp = arr[curr];
            arr[curr] = arr[turn];
            arr[turn] =  temp;
        }
    }
    public static void Array(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        SelectionSorting(arr);
        Array(arr);
    }
}
