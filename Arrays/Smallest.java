import java.util.Scanner;
public class Smallest {
    public static int smallest(int num[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < num.length ; i++){
        if(smallest > num[i]){
            smallest = num[i];
        }
    }
    return smallest; 
}

    public static void main(String args[]){
        int num[] = { 12,14,16,0,15,1,5};
        System.out.println("SMALLEST NUMBER :"+ smallest(num));
    }
}
