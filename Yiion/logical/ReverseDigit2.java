public class ReverseDigit2 {
    public static void main(String[] args) {
        int num = 9876;

        while(num >0){
            int rem = num%10;
            System.out.print(rem);
            num = num/10;

        }

    }
}
