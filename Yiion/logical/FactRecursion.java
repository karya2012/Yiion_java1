public class FactRecursion {
    static int factorial(int n){
        if(n==0)
            return 1;
       //
        System.out.println(n);
            return (n * factorial(n-1));
    }

    public static void main(String[] args) {
        int i,fact;
        int number = 5;
        fact = factorial(number);
        System.out.println("factorial of "+ number + " is "+fact);
    }
}
