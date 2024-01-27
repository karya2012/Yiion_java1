import java.util.Arrays;

public class SecondLargestNum {
    public static void main(String[] args) {
        int arr[] = {9,97,37,29,6,11};

        Arrays.sort(arr);
        System.out.println("sorted array: ");

        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }


        System.out.println("the largest element is : "+arr[arr.length-1]);
        System.out.println("the second largest element is : " + arr[arr.length-2]);

    }
}
