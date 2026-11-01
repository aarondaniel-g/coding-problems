//Time Complexity=O(log n)

class Solution {
    public static int binary(int[] arr,int tar){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==tar)return mid;
            if(arr[mid]<=arr[right]){
                if(tar>=arr[mid] && tar<=arr[right]){
                    left=mid+1;
                }
                else right=mid-1;
            }
            else if(arr[mid]>=arr[left]){
                if(tar>=arr[left] && tar<=arr[mid]){
                    right=mid-1;
                }
                else left=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return binary(nums,target);
        
    }
}
