class Solution {
    public static int min(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    }
    public int numberOfSubstrings(String s) {
        int[] hash={-1,-1,-1};
        int cnt=0;
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']=i;
            if(hash[0]!=-1 &&hash[1]!=-1&&hash[2]!=-1){
                cnt+=(1+min(hash));
            }
        }
        return cnt;
    }
}