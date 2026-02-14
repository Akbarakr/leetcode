class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=s.length();
        int c=0;
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            
            if(s.charAt(i)==t.charAt(j)){
                c++;
                i++;
                j++;

            }else if(s.charAt(i)!=t.charAt(j)){
                j++;
            }
        }
        if(c==l){
            return true;
        }
        return false;
    }
}