package Jan;

import java.util.Arrays;

public class Fibnacci_Serices {


    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        Fibnacci_Serices fb = new Fibnacci_Serices();
        System.out.println(fb.singleNumber(arr));
    }
}