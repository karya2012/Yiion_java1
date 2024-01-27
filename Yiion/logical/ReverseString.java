import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter string: ");
        String name = sc.nextLine();
        String rname = "";

        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            rname = ch+rname;
        }
        System.out.println("reversed string: " + rname);
    }
}
