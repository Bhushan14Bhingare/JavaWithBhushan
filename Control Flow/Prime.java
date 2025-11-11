public class Prime{
    public static boolean isPrime(int n){
        for(int i = 10 ; i <= n - 1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void Range(int n){
        for(int i = 10 ; i <= n -1 ; i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Range(99);
    }
}