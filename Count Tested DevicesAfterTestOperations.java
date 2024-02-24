class Solution {
    public int countTestedDevices(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                count++;
            for(int j=i;j<arr.length;j++){
              if(arr[j] == 0){
                  continue;
              } 
              else{
                  arr[j] -= 1;
              }
             }
            }
        }
        return count;
    }
}
