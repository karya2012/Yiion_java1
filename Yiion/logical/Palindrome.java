import java.util.Scanner;

public class Palindrome {
    static String str;
    public static String ReverseString(String str){
        if(str.length()>0){
            char ch = str.charAt(str.length()-1);
            System.out.print(ch);
            str = str.substring(0,str.length()-1);
            ReverseString(str);
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println("please enter string: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        ReverseString(name);
        System.out.println("");


        if(str.equals(name)){
            System.out.println("string is palindrome.");
        }
        {
            System.out.println("string is not palindrome.");
        }
    }
}
