class Solution {
    public int totalFruit(int[] nums) {
        int max=0;
        int l=0,r=0;
        int n=nums.length;
        int k=2;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        while(r<n){
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
            if(mpp.size()>2){
                while(mpp.size()>k){
                    mpp.put(nums[l],mpp.get(nums[l])-1);
                    if(mpp.get(nums[l])==0){
                        mpp.remove(nums[l]);
                    }
                    l++;
                }
            }
            if(mpp.size()<=k){
                int len=r-l+1;
                max=Math.max(max, len);
            }
            r++;
        }
        return max;
    }
}