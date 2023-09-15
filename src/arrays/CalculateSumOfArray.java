package arrays;

public class CalculateSumOfArray {
    public static void main(String[] args) {
        int []arr = {2,3,4,7,5,8,5};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        System.out.println(sum);
    }
}
