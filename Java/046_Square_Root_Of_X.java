class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        long left=1;
        long right=x;
        long ans=1;
        while(left<=right){
            long mid=(left+right)/2;
            if(mid*mid<=x){
                ans=mid;
                left=mid+1;
            }
            else if(mid*mid>=x){
                right=mid-1;
            }
        }
        return (int)ans;
        
    }
}