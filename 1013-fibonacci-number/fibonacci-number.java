class Solution {
    public int fib(int n) {
        if(n==0){
            return n;
        }else if(n==1||n==2){
            return 1;
        }
        int sum=0;
        int prev1=1;
        int prev2=1;
        for(int i=3;i<=n;i++){
            sum=prev1+prev2;
            prev2=prev1;
            prev1=sum;
        }return sum;
    }
}