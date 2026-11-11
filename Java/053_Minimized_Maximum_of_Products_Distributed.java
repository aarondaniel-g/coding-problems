class Solution {
    public static long func(int[] nums,int mid,int n){
        long tot=0;
        for(int i=0;i<nums.length;i++){
            int ro=(int)Math.ceil((double)nums[i]/mid);
            tot+=ro;
        }
        return tot;
    }
    public int minimizedMaximum(int n, int[] nums) {
        int max=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int left=0;
        int right=max;
        while(left<=right){
            int mid=(left+right)/2;
            long pos=func(nums,mid,n);
            if(pos<=n){
                ans=Math.min(ans,mid);
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}