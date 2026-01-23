class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String[] words=sentences[i].split(" ");
            int c=0;
            for(String word: words){
                c++;
            }
            if(c>max){
                max=c;
            }
        }return max;
    }
}
