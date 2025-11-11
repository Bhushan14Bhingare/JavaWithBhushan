import java.util.Scanner;
public class AreaSquare {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        int side = sk.nextInt();
        int area = side*side;
        System.out.println("Area is =" + area);
    }
    
}
