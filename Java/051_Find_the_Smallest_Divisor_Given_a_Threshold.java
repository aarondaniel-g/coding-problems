class Solution {
    public static long func(int[] nums,int mid,int thres){
        long tot=0;
        for(int i=0;i<nums.length;i++){
            int ro=(int)Math.ceil((double)nums[i]/mid);
            tot+=ro;
        }
        return tot;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int left=0;
        int right=max;
        int ans=Integer.MAX_VALUE;
        while(left<=right){
            int mid=(left+right)/2;
            long pos=func(nums,mid,threshold);
            if(pos>threshold){
                left=mid+1;
            }
            else{
                ans=Math.min(ans,mid);
                right=mid-1;
            }
        }
        return ans;
    }
}