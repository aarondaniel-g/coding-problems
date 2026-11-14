class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[right]==nums[mid] && nums[left]==nums[mid]){
                right--;
                left++;
                ans=Math.min(ans,nums[mid]);
                continue;
            }
            if(nums[mid]<=nums[right]){
                ans=Math.min(ans,nums[mid]);
                right=mid-1;
            }
            else if(nums[mid]>=nums[left]){
                ans=Math.min(ans,nums[left]);
                left=mid+1;
            }

        }
        return ans;
    }
}