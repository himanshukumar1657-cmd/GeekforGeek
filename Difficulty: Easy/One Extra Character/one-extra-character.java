class Solution {
    public char extraChar(String s1, String s2) {
       char xor=0;
       for(char ch:s1.toCharArray()){
           xor^=ch;
       }
        for(char ch:s2.toCharArray()){
           xor^=ch;
       }
       return xor;
    }
}