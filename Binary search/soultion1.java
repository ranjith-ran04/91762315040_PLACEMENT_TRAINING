class Solution1 {
    void pushZerosToEnd(int[] arr) {
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        for(int i=k;k<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}