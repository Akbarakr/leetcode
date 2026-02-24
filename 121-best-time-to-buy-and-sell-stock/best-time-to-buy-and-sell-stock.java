class Solution {
    public int maxProfit(int[] prices) {
        int minprofit=Integer.MAX_VALUE; 
	    int maxprofit = 0;
        for(int i: prices){
            if(i<minprofit){
                minprofit=i;
            }
            int profit= i-minprofit;

            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;

	    }

	}
    