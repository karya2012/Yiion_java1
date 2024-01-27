import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        System.out.print("please enter A: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("please enter B: ");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("now A: "+a);
        System.out.println("now B: "+b);
    }
}
