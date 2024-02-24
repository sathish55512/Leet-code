class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> list=new ArrayList<Integer>(); 
        int[] ans = new int[2]; 
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(list.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }
                else{
                    list.add(grid[i][j]);
                }
              }   
            }
           Collections.sort(list);
           for(int i=1;i<=grid.length*grid.length;i++){
               if(list.contains(i)){
                   continue;
               }
               else{
                   ans[1] = i;
                   return ans;
                   
               }
           }
        return ans;

        }
        
    }
