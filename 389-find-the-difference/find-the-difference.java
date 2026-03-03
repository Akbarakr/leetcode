class Solution {
    public char findTheDifference(String s, String t) {
        int charSum = 0;
        
        // Add ASCII values of t
        for (char c : t.toCharArray()) {
            charSum += c;
        }
        
        // Subtract ASCII values of s
        for (char c : s.toCharArray()) {
            charSum -= c;
        }
        
        // The difference is the added character
        return (char) charSum;
    }
}