public class PrintPyramid {
    public static void main(String args[]){
        int m = 4;
        
        for (int i = 1; i <= m; i++){
            for(int number = 1 ; number <= i ; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
