import java.util.Scanner;
public class Square {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter a side : ");
        int side = sk.nextInt();
        int area = side * side ;
        System.out.println("Area Of side square : "+area);
    }
}
