class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        while(num>9){
        int m=num%10;
        int v=num/10;
        num=m+v;
        m=0;
        v=0;
        }
        return num;
    }
}