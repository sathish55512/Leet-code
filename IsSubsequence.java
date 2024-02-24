class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int j = 0;        
        for(int i=0;i<t.length();i++){
            char A = s.charAt(j);
            if(t.charAt(i)==A){
                if(j == s.length()-1){
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}
