class Solution {
    public static long func(int[] arr,int mid){
        long total=0;
        for(int i=0;i<arr.length;i++){
            total+=(int)Math.ceil((double)arr[i]/mid);
        }
        return total;
    }
    public int minimumRateToEatBananas(int[] nums, int h) {
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(max,x);
        }
        int left=1;
        int right=max;
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            long result=func(nums,mid);
            if(result<=h){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}