class Solution {
    public int lengthOfLastWord(String s) {

        String[] ar = s.split(" ");

        String lastWord = ar[ar.length -1];

        int lastWordLength = lastWord.length();

        return lastWordLength;


        
    }
}
