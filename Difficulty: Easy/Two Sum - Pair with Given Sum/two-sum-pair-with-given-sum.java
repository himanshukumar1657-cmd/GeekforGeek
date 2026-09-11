class Solution {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==target){
                return true;
            }
            else if(arr[low]+arr[high]<target){
                low++;
            }
            else{
                high--;
            }
        }
        return false;
        
    }
}