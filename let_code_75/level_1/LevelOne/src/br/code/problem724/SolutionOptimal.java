package br.code.problem724;

public class SolutionOptimal{

    public int pivotIndex(int[] nums) {
        int sumLeft =0, sum =0;
        for(int num : nums)
            sum += num;
        for(int i = 0; i< nums.length;i++){
            if(sumLeft == sum - sumLeft - nums[i]) return i;
            sumLeft += nums[i];
        }
        return -1;

    }

}