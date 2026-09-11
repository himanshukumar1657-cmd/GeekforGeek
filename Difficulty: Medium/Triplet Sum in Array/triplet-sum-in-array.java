class Solution {
    public boolean hasTripletSum(int arr[], int target) {
       
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int low=i+1;
            int high=arr.length-1;
            while(low<high){
                if(arr[i]+arr[low]+arr[high]==target){
                    return true;
                }
                else if(arr[i]+arr[low]+arr[high]<target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return false;
    }
}
