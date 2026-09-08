class Solution {
    public static void changeCase(String s) {
        // code here
        String first=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        String second=s.toUpperCase();
        System.out.println(first);
        System.out.println(second);
        
    }
}