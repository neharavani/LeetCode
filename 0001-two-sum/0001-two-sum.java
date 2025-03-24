class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int n=nums.length;
        int[] ans= {-1,-1};
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if((nums[i]+nums[j])==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;

    }
}