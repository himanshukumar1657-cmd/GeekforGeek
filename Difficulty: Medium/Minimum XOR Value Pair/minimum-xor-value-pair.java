class Solution {
    public int minXor(int[] arr) {
        // code here
        Arrays.sort(arr);
        int minXor=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            minXor=Math.min(minXor,arr[i]^arr[i-1]);
            
        }
        return minXor;
    }
}