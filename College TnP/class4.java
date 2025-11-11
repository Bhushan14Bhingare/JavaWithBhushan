import java.util.HashSet;
import java.util.Set;
public class class4{
    public static void main (String[]args){
        String[]  arr1={"1993", "1995" ,"2000","2006","2017","2020"};
        String[]  arr2={"1990","1993","1995","2010","2016","2017"};
        Set<String> output=new HashSet <>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    output.add(arr1[i]);
                    break;
                }
            }
        }
        for (String s:output){
            System.out.println("Comman Element is "  + s);
        }
    }
}
