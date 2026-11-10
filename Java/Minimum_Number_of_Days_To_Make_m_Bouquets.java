class Solution {
    public static boolean func(int[] arr,int mid,int m,int k){
        int tot=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid)cnt++;
            else{
                tot+=cnt/k;
                cnt=0;
            }
        }
        tot+=cnt/k;
        return tot>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) {
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            max=Math.max(max,bloomDay[i]);
            min=Math.min(min,bloomDay[i]);
        }
        int left=min;
        int right=max;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            
            if(func(bloomDay,mid,m,k)){
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