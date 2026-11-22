class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        int[] hash=new int[501];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        for(int i=500;i>=1;i--){
            if(hash[i]==i){
                return i;
            }

        }
        return -1;
        
    }
}