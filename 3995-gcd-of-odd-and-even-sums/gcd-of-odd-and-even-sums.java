class Solution {
    public int gcdOfOddEvenSums(int n) {
    
        int oddsum=0;
        int evensum=0;
        for(int i=1;i<=n*2;i=i+2){
            oddsum=oddsum+i;
        }
        
        for(int i=2;i<=n*2;i=i+2){
            evensum=evensum+i;
        }
        for(int i=oddsum;i>=2;i--){
            if(oddsum%i==0&&evensum%i==0){
                return i;
            }
        }return 1;
    }
}
