import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println("please enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("number "+ number+ " is even.");
        }
        if(number%2!=0){
            System.out.println("numer "+ number+ " is odd.");
        }

    }
}
