class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums){
            pq.add(x);
        }
        int i=0;
        int[] arr=new int[nums.length];
        while(!pq.isEmpty()){
            arr[i]=pq.poll();
            i++;
        }
        return arr[nums.length-k];
    }
}