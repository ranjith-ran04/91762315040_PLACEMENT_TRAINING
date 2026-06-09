class Solution {
    public static int findEquilibrium(int arr[]) {
        int currsum=0;
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            if(currsum==total){
                return i;
            }
            total-=arr[i];
        }
        return -1;
    }
}
