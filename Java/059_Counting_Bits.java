class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            int x=i;
            int cnt=0;
            while(x!=0){
                if((x&1)==1)cnt++;
                x=x>>1;
            }
            arr[i]=cnt;
            
        }
        return arr;
    }
}