public class fibbonacci {
    public static void main(String[] args) {
        int n1 =0, n2=1;
        int number = 10;
        System.out.print(n1 + " " + n2 + " ");
        for(int i=2;i<number;i++){
           int n3 = n2 + n1;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
