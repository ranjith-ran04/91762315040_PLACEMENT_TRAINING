class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length-1,beg=0;
        while(beg<=len){
            int mid=beg+(len-beg)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                beg=mid+1;
            }else{
                len=mid-1;
            }
        }

        return beg;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target || nums[i]>target){
        //         return i;
        //     }
        // }
        // return nums.length;
    }
}