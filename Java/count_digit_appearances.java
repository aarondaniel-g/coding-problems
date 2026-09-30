class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt=0;

        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            
            while(n!=0){
                int dig=n%10;
                if(dig==digit){
                    cnt++;
                }
                n=n/10;
            }
        }
        return cnt;
    }
}