public class Largest {
    public static int Largest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < num.length ; i++){
            if(largest < num [i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }

        }
        System.out.println(smallest);
        return largest;
    }
    public static void main(String args[]){
        int num[] = {1,3,5,53,7,11,13};

        System.out.println(Largest(num));
    }
}
