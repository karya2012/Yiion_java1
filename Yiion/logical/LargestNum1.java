public class LargestNum1 {
    public static void main(String[] args) {
        int arr[] = {9,76,29,45,7,66,98};
        int temp = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];

            }
        }
        System.out.println("largest number: "+temp);
    }
}
