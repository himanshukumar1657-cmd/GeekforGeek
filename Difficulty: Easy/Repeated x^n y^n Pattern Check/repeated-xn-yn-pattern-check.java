class Solution {
    public

        boolean
        findPattern(String s) {
            int i=0;
        int countx=0;
        int county=0;
        while(i<s.length()){
            
        while(i<s.length() && s.charAt(i)=='x'){
            countx++;
            i++;
        }
        if(countx==0){
            return false;
        }
            while(i<s.length() && s.charAt(i)=='y'){
            county++;
            i++;
            }
            if(countx!=county){
                return false;
            }
        }
            return true;
    }
};