class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            char ch=s2.charAt(i);
            arr[ch-'a']--;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                return false;
            }
        }
        return true;
    }
}