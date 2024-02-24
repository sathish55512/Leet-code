class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        if(word1.length() == word2.length()){
            for(int i=0;i<word1.length();i++){
                ans += word1.charAt(i);
                ans += word2.charAt(i);
            }
            return ans;
        }
        else if(word1.length() > word2.length()){
           for(int i=0;i<word2.length();i++){
               ans += word1.charAt(i);
               ans += word2.charAt(i); 
           }
           for(int i=word2.length();i<word1.length();i++){
               ans += word1.charAt(i);
           }
           return ans;
        }

        for(int i=0;i<word1.length();i++){
               ans += word1.charAt(i);
               ans += word2.charAt(i); 
           }
           for(int i=word1.length();i<word2.length();i++){
               ans += word2.charAt(i);
           }
           return ans;
    }
}