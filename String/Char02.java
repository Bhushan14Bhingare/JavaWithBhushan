public class Char02 {
    public static void PrintString(String str){
        for(int i = 0 ; i < str.length();i++){
           System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void  main(String args[]){
        String firstname = "Bhushan";
        String lastname = "Bhingare";
        String fullname = firstname + " " + lastname;
        PrintString(fullname);

    }
}
