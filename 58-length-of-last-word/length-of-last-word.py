class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        i=len(s)-1
        c=0
        while i>=0:
            if s[i]!=' ':
                c=c+1
            elif(c>0):
                break
            i=i-1
        return c

        