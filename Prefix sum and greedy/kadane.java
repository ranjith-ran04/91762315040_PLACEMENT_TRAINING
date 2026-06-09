class Solution {
    int maxSubarraySum(int[] arr) {
        int currsum=arr[0],maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i]+currsum){
                currsum=arr[i];
            }else{currsum=arr[i]+currsum;}
            
            if(currsum>maxsum){
                maxsum=currsum;
            }
        }
        return maxsum;
    }
}
