class Solution {
    public int longestSubstr(String s, int k) {
        int count[]=new int [26];
        int left=0;
        int maxfre=0;
        int result=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            count[ch-'A']++;
            maxfre = Math.max(maxfre, count[ch - 'A']);
            if((i-left+1)-maxfre>k){
                 char ch1=s.charAt(left);
                count[ch1-'A']--;
                left++;
                
            }
            result = Math.max(result, i - left + 1);
        
            
        }
        return result;
        
    }
}
