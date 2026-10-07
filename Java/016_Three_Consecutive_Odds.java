class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt=0;
        int tot=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                cnt++;
                if(cnt>tot){
                    tot=cnt;
                }
            }
            else{
                cnt=0;
            }
        }
        if(tot>=3){
            return true;

        }
        else{
            return false;
        }
        
        
    }
}