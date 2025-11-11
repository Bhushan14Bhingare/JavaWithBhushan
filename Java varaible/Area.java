import java.util.Scanner;
public class Area {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        System.out.println("Enter the raduis");
        float rad = sk.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    }    
}
