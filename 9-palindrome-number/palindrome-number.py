class Solution:
    def isPalindrome(self, x: int) -> bool:
        if (x<0):
            return False
        o=x
        t=0
        while(x!=0):
            d=x%10
            t=t*10+d
            x=x//10
        return o==t