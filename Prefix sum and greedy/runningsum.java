class Solution {
    public int[] runningSum(int[] nums) {
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
            nums[i]=currsum;
        }
        return nums;
    }
}