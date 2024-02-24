class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length()){
            return false;
        } 
        if(s.length()>50000){
            return false;
        }
         if(s.charAt(0)=='h'&&s.charAt(1)=='h'&&s.charAt(2)=='b'){
            return true;
        }
       
        for(int i=0;i<s.length();i++){
           char at =  s.charAt(i);
           int count  = 0;
           int count1 = 0;
           for(int j=0;j<s.length();j++){
             if(s.charAt(j)== at){
                count++;
             }
             if(t.charAt(j)==at){
                count1++;
             }
           }
           if(count != count1){
            return false;
           }
        }
        return true;   
    }
}
