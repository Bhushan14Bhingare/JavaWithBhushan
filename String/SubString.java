public class SubString {
    public static String Sub(String str, int si, int ei){
        String substring = "";
        for(int i = si ; i < ei ; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    public static void main(String args[]){
       String str = "Bhushan";
       System.out.println(Sub(str,0,5));
    }
}
