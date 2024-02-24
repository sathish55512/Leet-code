class Solution {
    public String longestCommonPrefix(String[] strs) {
     char let ;
      String ans ="";
      if(strs[0] == ""){
        return ans;
      }
      int min = 1000;
         for(int i=0;i<strs.length;i++){
           if(min >strs[i].length() ){
             min = strs[i].length();
           }
         }
         
         for(int i=0;i< min;i++){
           let = strs[0].charAt(i);
           for(int j = 0;j<strs.length;j++){
             if(strs[j].charAt(i)==let){
                 if(j == strs.length-1){
                 ans += let;
               }
             }
             else{
                 break;
             }
           }
           if(ans.length()!=i+1){
            break;
           }
         }
         return ans; 
   }
}
