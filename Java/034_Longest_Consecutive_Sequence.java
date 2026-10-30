class Solution {

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 0;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] - 1) == lastSmaller) {
                count = count + 1;
                lastSmaller = nums[i];
            } else if (nums[i] != lastSmaller) {
                count = 1;
                lastSmaller = nums[i];
            }
            if (nums.length == 0) {
                return 0;
            }
            longest = Math.max(longest, count);
        }

        return longest;
    }
}