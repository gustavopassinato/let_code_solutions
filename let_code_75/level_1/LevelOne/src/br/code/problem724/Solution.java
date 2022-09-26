package br.code.problem724;

import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        
        for (int i = 0; i< nums.length;i++){
            if( i == 0 ){
                if(subListSum(Arrays.copyOfRange(nums, 1, nums.length )) == 0)
                    return 0;
            }else if (i == nums.length -1){
                if(subListSum(Arrays.copyOfRange(nums, 0, nums.length - 1 )) == 0)
                    return nums.length -1;
            }else{
                int left = subListSum(Arrays.copyOfRange(nums, 0, i ));

                int right = subListSum(Arrays.copyOfRange(nums, i+1, nums.length ));
                if ( left == right)
                    return i;
            }
        }
        return -1;
    }

    private int subListSum(int[] subList){
        int result = 0;
        for(int value : subList){
            result += value;
        }
        return result;
    }
}
