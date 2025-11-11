import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class class5 { 
        
    public static void main (String[]args){

    String[]  arr1={"C", "C++" ,"JAVA","SQL","ORACLE"};
    String[]  arr2={"MySQL","SQL","Android","ORACLE","PostgreSQL","DB2","JAVA"};
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
