public class Array {
    public static void main(String[] args) {
        int arr[] = {78,5,93,21,46,58};


        //int arr1[] = arr1[];

        System.out.println("length of array is : " + arr.length);

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>arr[0]){
                arr[0]=arr[i];
            }
            System.out.println("index of array is " + i + " " + arr[i]);
        }

        /*System.out.println("largest element: " + arr[0]);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        String  arr1[] = {"arya","kanak"};
        for(int i=0;i< arr.length;i++){
            System.out.println(arr1[i]);
        }
        */


    }
}
