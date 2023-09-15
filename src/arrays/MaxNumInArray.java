package arrays;

public class MaxNumInArray {
    public static void main(String[] args) {
        int a[] ={12,34,5,23,22};
        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(max<a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
