package arrays;

public class MinNumInArray {
    public static void main(String[] args) {
        int arr[] ={18,3,5,7,5};
        int min = arr[0];

        for(int i=1; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
