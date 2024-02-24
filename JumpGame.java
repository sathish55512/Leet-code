class Solution {
    public static boolean canJump(int[] arr) {
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == 0){
                for(int j=i;j>=0;j--){
                   if(i-j<arr[j]){
                       i = j;
                       break;
                   }
                     if(i-j<=arr[j]&&i==arr.length-1){
                       i = j;
                       break;
                   }
                   if(j==0){
                    return false;
                   }
                }
            }
        } 
        return true;
     }
}
