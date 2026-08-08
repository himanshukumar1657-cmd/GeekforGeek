class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        subsetSums1(arr,0,0,ans);
        return ans;
        
    }
    public void subsetSums1(int arr[],int idx,int sum,ArrayList<Integer>ans){
        if(idx==arr.length){
            ans.add(sum);
            return;
        }
        
        
        subsetSums1(arr,idx+1,sum+arr[idx],ans);
        subsetSums1(arr,idx+1,sum,ans);
        
    }
}