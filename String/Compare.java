public class Compare {
    public static void main(String args[]){
        String s1 = "Bhushan";
        String s2 = "Bhushan";
        String s3 = new String("Bhushan");

        if(s1==s2){
            System.out.println("String are Equal");
        }
        else{
            System.out.println("String are not Equal");
        }

        if(s1.equals(s3)){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }
}
