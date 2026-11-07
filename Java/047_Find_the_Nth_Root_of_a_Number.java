class Solution {
    public static long sqrt(int mid,int m){
        long ans=1;
        for(int i=1;i<=m;i++){
            ans=ans*mid;
        }
        return ans;
    }
    public int NthRoot(int n, int m) {
        long left=1;
        long right=m;
        while(left<=right){
            long mid=(left+right)/2;
            long result=sqrt(mid,n);
            if(result==m){
                return (int)mid;
            }
            else if(result<=m){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;

    }
}
