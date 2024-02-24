class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        
        for(int i=0;i<matrix[0].length;i++){
           int max = Integer.MIN_VALUE;
           for(int j=0;j<matrix.length;j++){
              if(matrix[j][i]>max){
                  max = matrix[j][i];
              } 
           } 
           for(int k=0;k<matrix.length;k++){
               if(matrix[k][i] == -1){
                   arr[k][i] = max;
               }
               else{
                   arr[k][i] = matrix[k][i];
               }
           }
        }
        return arr;
    }
}
