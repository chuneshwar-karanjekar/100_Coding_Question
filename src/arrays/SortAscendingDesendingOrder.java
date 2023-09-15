package arrays;

//Sort first half in ascending order and second half in descending
public class SortAscendingDesendingOrder {
    public static void main(String[] args) {
        int []arr = new int[]{5,4,3,2,1,1,2,3,4,5};
        int n = arr.length;
        int temp=0;
        for (int i = 0; i < n/2; i++) {
            for (int j = i+1; j < n/2; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
            System.out.print(" "+arr[i]);
        }
        for (int i = n/2; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
            System.out.print(" "+arr[i]);
        }
    }
}
