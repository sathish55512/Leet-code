class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8){
            return word.length();
        }
        
        if(word.length()>8&&word.length()<17){
            int total = word.length();
            total += (word.length()-8);
            return total;
        }
        if(word.length()>16&&word.length()<=24){
            int total  = 24;
            total += (word.length()-16)*3;
            return total;
        }
        if(word.length() == 25){
            return 52;
        }
        else{
            return 56;
        }
    }
}