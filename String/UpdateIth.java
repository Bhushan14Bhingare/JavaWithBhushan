public class UpdateIth {
    public static int clearIthbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int Update(int n, int i, int newbits){
        
        n = clearIthbit(n,i);
        int BitMask = newbits << i;
        return n | BitMask;
    }
    public static void main(String args[]){
        System.out.println(Update(10,2,1));
    }
}
