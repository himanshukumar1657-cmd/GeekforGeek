class Solution {
    static String decToBinary(int n) {
        // code here
        String str="";
       while(n>0){
           int m=n%2;
           str+=m;
           n=n/2;
       } 
       StringBuilder str2=new StringBuilder(str);
       
       return str2.reverse().toString();
    }
}