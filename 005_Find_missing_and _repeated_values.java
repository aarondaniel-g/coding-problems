class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] hash=new int[grid.length*grid.length+1];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                hash[grid[i][j]]++;
            }
        }
        int repeat=0;
        int missing=0;
        for(int i=1;i<hash.length;i++){
            if(hash[i]==2){
                repeat=i;
            }
            if(hash[i]==0){
                missing=i;
            }
        }
        return new int[]{repeat,missing};
          
        
    }
}
