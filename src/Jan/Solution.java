package Jan;

import java.util.Arrays;
import java.util.function.Consumer;

class Solution{
    public void sort012(int[] arr) {
        int z = 0;
        int o = 0;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                z++;
            }
            if (arr[i] == 1) {
                o++;
            }
            if (arr[i] == 2) {
                t++;
            }
        }
        int ind = 0;
        for (int i = 0; i < z; i++) {
            arr[ind++] = 0;
        }
        for (int i = 0; i < o; i++) {
            arr[ind++] = 1;
        }
        for (int i = 0; i < t; i++) {
            arr[ind++] = 2;
        }
    }
    public void display ( int[] arr){
        Consumer<int[]>b = i->System.out.print(Arrays.toString(i) + " ");
        b.accept(arr);
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};
        Solution s = new Solution();
        s.display(arr);
        s.sort012(arr);
        s.display(arr);
    }
}