class Solution {
    static int lower(int[] arr,int x,int n){
        int left=0;
        int right=n;
        int ans=n+1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=x){
                ans=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
    static int upper(int[] arr,int x,int n){
        int left=0;
        int right=n;
        int ans=n+1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>x){
                ans=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int lb=lower(nums,target,nums.length-1);
        if(lb==nums.length || nums[lb]!=target)return new int[]{-1,-1};
        int ub=upper(nums,target,nums.length-1);
        return new int[]{lb,ub-1};
    }
}