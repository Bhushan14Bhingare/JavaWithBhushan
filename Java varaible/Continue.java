public class Continue {
    public static void main(String args[]){
        int i = 1;
        for(i=1 ; i<=5 ; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
