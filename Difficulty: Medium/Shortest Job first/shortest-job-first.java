class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int sum=0;
        int n=bt.length;
        int totalWaiting = 0;
        int currentTime = 0;

        for(int b:bt){
          totalWaiting+=currentTime;
          currentTime+=b;
        }
        return totalWaiting/n;
    }
}
