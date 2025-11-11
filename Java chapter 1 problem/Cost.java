import java.util.Scanner;
public class Cost {
    public static void main(String args[]){
        Scanner sk = new Scanner(System.in);
        float pen = sk.nextFloat();
        float pencil = sk.nextFloat();
        float eraser = sk.nextFloat();
        float total = pencil+pen+eraser;
        System.out.println(total);
//add 18% gst
        float bill = total + (0.18f * total);
        System.out.println("Bill is " + bill);
    }
    
}
