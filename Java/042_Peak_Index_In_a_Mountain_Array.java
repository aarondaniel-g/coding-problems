class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        if(n==1)return arr[0];
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]) return mid;
            if(arr[mid]<arr[mid+1])left=mid+1;
            if(arr[mid]>arr[mid+1]) right=mid-1;
        }
        return -1;
    }

}