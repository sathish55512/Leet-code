class Solution {
    public char findTheDifference(String s, String t) {
        for(char c='a';c<='z';c++){
            int count = 0;
            int count1= 0;
            for(int i=0;i<s.length();i++){
                if(c == s.charAt(i)){
                    count++;
                }
            }
            for(int j=0;j<t.length();j++){
                if(c == t.charAt(j)){
                    count1++;
                }
            }
            if(count!=count1){
               return c; 
            }
        }
        return '0';
    }
}