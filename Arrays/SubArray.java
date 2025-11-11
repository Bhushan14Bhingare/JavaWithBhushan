public class SubArray {
    public static void Sub(int num[]){
        for(int i = 0 ; i < num.length ; i++){
             int Start = i; 
             for(int j = i ; j < num.length; j++){
                int end = j;
                for(int k = Start ; k <= end ; k++){
                    System.out.print(num[k] +" ");
                }
               System.out.println();
            } 
        System.out.println();
        }
    }
    public static void main(String args[]){
        int num[] = {4,6,8,2,5};
        Sub(num);
    }
}
