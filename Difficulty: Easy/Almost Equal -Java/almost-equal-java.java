/*Function to count number of characters
 * to make s1 and s2 equal
 * s1 : first string
 * s2 : second string
 */
class Geeks {

    static int coutChars(String s1, String s2) {

        // Your code here
        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            arr[ch-'a']--;
        }
        int count = 0;
        for(int i = 0; i < 26; i++) {
                   count += Math.abs(arr[i]);
               }
               return count;
       
    }
}