class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        res[0]=first(nums,target);
        if(res[0]==-1){
            return res;
        }
        res[1]=second(nums,target);
        return res;
    }
    private int first(int nums[],int target){
        int left=0,right=nums.length-1,ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return ans;
    }
    private int second(int nums[],int target){
        int left=0,right=nums.length-1,ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        return ans;
    }
}

