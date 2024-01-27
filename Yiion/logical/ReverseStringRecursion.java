public class ReverseStringRecursion {
    static String ReverseString(String str){
        if(str.length()>0){
            char ch = str.charAt(str.length()-1);
            System.out.print(ch);

            //using substring
            str = str.substring(0,str.length()-1);
            ReverseString(str);

        }
        return str;
    }
    public static void main(String[] args) {
        String name = "Rose";
        ReverseString(name);
    }
}
