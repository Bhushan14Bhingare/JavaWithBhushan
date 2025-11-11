public class MaxSubArray {
    public static void MaxSubArraySum(int num[]){
        int currSum = 0 ;
        int maxArray = Integer.MIN_VALUE;

        for(int i = 0 ; i < num.length ; i++){
            int start = i;
              for(int j = i ; j < num.length ; j++){
                int end = j;
                currSum = 0;
                  for(int k = start ; k <= end ; k ++){
                    currSum = currSum + num[k];
                  }
        
                if(maxArray < currSum){
                    maxArray = currSum;
                }
            }
        }
        System.out.print(maxArray);
    }
    public static void main(String args[]){
        int num[] = {2,4,6,8,10};
         MaxSubArraySum(num);
    }
}
