import java.util.Scanner;
public class Totalcost {
    public static void main(String args[]){

        Scanner sk = new Scanner (System.in);

        System.out.print("Enter pencil prize : ");
        float pencil  = sk.nextFloat();

        System.out.print("Enter pen prize : ");
        float pen = sk.nextFloat();

        System.out.print("Enter eraser prize : ");
        float eraser = sk.nextFloat();
        
        float total = pen + pencil + eraser ;
        System.out.println("Total prize " +total);

        // Add Gst 18%
        float newtotal = total + (0.18f * total);
        System.out.println("Bill with 18% gst : " +newtotal);
    }
}
