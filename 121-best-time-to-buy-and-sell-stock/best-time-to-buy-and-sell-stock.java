class Solution {
    public int maxProfit(int[] prices) {
        int minprofit=Integer.MAX_VALUE; 
	    int maxprofit = 0;
        int profit=0;
        for(int i: prices){
            if(i<minprofit){
                minprofit=i;
            }else{
                profit= i-minprofit;
            }

            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;

	    }

	}
    