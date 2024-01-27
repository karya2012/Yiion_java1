public class ReverseDigit {
    public static void main(String[] args) {
        int num = 9876;
        String strnum = Integer.toString(num);
        String rnum = "";

        for(int i=0;i<strnum.length();i++){
            char ch = strnum.charAt(i);
            rnum = ch+ rnum;
        }
        System.out.println(rnum);

    }
}
