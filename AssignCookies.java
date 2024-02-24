class Solution {
    public int findContentChildren(int[] g, int[] s) {
     Arrays.sort(g);
     Arrays.sort(s);
     int count = 0;
     int k = g.length-1;
     for(int i=s.length-1;i>=0;i--){
         for(int j=k;j>=0;j--){
            if(s[i]>=g[j]){
                count++;
                k = j-1;
                break;
            }
         }
     }  
     return count; 
    }
}