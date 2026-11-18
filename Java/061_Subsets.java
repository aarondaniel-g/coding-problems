class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        int subset=(1<<n);
        for(int i=0;i<subset;i++){
            List<Integer> tot=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    tot.add(nums[j]);
                }
            }
            res.add(tot);
        }
        return res;
    }
}