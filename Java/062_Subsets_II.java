class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        int subset=(1<<n);
        Arrays.sort(nums);
        for(int i=0;i<subset;i++){
            List<Integer>tot=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0)tot.add(nums[j]);
            }
            res.add(tot);
        }
        return new ArrayList<>(res);
    }
}