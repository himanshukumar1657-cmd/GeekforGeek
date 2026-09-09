class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder str=new StringBuilder(s);
        int low=0;
        int high=s.length()-1;
        while(low<high){
            char ch1=str.charAt(low);
             char ch2=str.charAt(high);
            str.setCharAt(low,ch2);
            str.setCharAt(high,ch1);
            low++;
            high--;
        }
        return str.toString();
    }
}