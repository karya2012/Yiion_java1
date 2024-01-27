public class primenumber {
    public static void main(String[] args) {
        int number = 7;
        int m =number/2;
        int i, flag =0;
        if(number==0 && number==1){
            System.out.println("number is not prime number.");
        }
        else{
            for(i=2;i<m;i++){
                if(number%i==0){
                    System.out.println("number is not prime.");
                    flag = 1;
                }
            }
        }
        if(flag==0){
            System.out.println("number is prime.");
        }
    }

}
