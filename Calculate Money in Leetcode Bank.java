
class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int coin = 1;
        int count = 7; 
        while(n!=0){
           sum += coin;
           coin += 1;
           count--;
           n--;
           if(count == 0){
               coin -= 6;
               count = 7;
           } 
        }
        return sum;
    }
}