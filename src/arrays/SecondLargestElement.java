package arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {12,34,53,11,33,8};
        int first = arr[0],second=0;
        for(int i=0; i< arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    first = arr[i];
                    arr[i] = arr[j];
                    arr[j] = first;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println("second largest element is : "+arr[arr.length-2]);
    }
}
