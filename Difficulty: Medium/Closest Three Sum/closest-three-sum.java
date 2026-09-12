import java.util.*;

class Solution {
    public int closest3Sum(int[] arr, int target) {

        Arrays.sort(arr);

        int minres = arr[0] + arr[1] + arr[2];
        int mindiff = Math.abs(minres - target);

        for (int i = 0; i < arr.length - 2; i++) {
            
            int low = i + 1;
            int high = arr.length - 1;
            while (low < high) {
                int sum = arr[i] + arr[low] + arr[high];
                int diff = Math.abs(sum - target);

                if (diff < mindiff) {
                    mindiff = diff;
                    minres = sum;
                }
                else if (diff == mindiff) {
                    minres = Math.max(minres, sum);
                }

                if (sum < target) {
                    low++;
                }
                else {
                    high--;
                }
                
            }
        }
        
          return minres;  
        }

        
    }
