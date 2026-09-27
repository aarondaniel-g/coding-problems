class Solution {
    public int reverseDegree(String s) {
        int tot=0;
        for(int i=0;i<s.length();i++){
            int value='z'-s.charAt(i)+1;
            int n=value*(i+1);
            tot+=n;
        }
        return tot;
    }
}
