
public class Binary {
    public static int BinarySearch(int num[] , int key){
    int start = 0 , end = num.length -1;
         
           while(start <= end){
            int mid = (start + end)/2;
              if(num[mid] == key){
                return mid;
                }
                   //starting point shipted right side
                if(num[mid] < key){
                    start = mid + 1;
                }

                // end point shipted left side
                else
                {
                    end = mid - 1;
                }
           }
           return -1;
    }

    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12,16,18};
        int key = 2;
        System.out.println(BinarySearch(num,key));
    }
}
