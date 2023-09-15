package arrays;

public class SortingElementsOfArrayByFrequency {
    public static void main(String[] args) {
        int []a = new int[]{1,2,4,5,2,2,3,1,2,3,6};
        boolean visited[] = new boolean[a.length];
        int freq = 1;
        for (int i = 0; i < a.length; i++) {
            if (visited[i] == true)
                continue;

                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        visited[j] = true;
                        freq++;
                    }

                }
                System.out.println(a[i] + " occurs " + freq + " times ");
        }
    }
}
