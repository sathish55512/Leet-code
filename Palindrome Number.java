class Solution {
    public boolean isPalindrome(int x) {
      long a= 0;
        int temp=x;
        boolean c = true;
        if(x==0){
            c = true;
        }
        else if(x%10==0){
            c = false;
        }
        

        while (x!=0){
            a+=x%10;
            x=x/10;
            a=a*10;
            if(a>temp){
                a=a/10;
            }
                
            }
        
        if(a!=temp){
            c = false;
        }
        
        return c;
    }
}class Solution {
    public boolean isPalindrome(int x) {
      long a= 0;
        int temp=x;
        boolean c = true;
        if(x==0){
            c = true;
        }
        else if(x%10==0){
            c = false;
        }
        

        while (x!=0){
            a+=x%10;
            x=x/10;
            a=a*10;
            if(a>temp){
                a=a/10;
            }
                
            }
        
        if(a!=temp){
            c = false;
        }
        
        return c;
    }
}