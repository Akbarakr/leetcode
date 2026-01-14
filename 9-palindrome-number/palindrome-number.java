class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=x;
        int t=0;
        while(x!=0){
            int d=x%10;
            t=10*t+d;
            x=x/10;
        }
        if(y==t){
            return true;
        }else{
      return false;  
        }
    }
}