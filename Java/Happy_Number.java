class Solution {
    public boolean isHappy(int n) {
        while (n!=1 && n!=4){
            int tot=0;
            while(n!=0){
                int dig=n%10;
                tot=tot+dig*dig;
                n=n/10;
            }
            n=tot;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
        
    }
}