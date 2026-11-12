class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=(n*m)-1;
        boolean isthere=false;
        while(left<=right){
            int mid=(left+right)/2;
            int r=mid/m;
            int c=mid%m;
            if(matrix[r][c]==target){
                isthere=true;
                break;
            }
            else if(matrix[r][c]<=target)left=mid+1;
            else right=mid-1;
        }
        return isthere;
    }
}