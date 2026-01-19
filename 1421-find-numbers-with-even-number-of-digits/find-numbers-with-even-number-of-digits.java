class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            String s=Integer.toString(n);
            if (s.length()%2==0){
                count++;
            }
        }return count;
    }
}