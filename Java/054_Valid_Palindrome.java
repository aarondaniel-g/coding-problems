class Solution {
    public boolean isPalindrome(String s) {
        String nn=s.toLowerCase();
        String res="";
        for(int i=0;i<nn.length();i++){
            char ch=nn.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res+=ch;
            }
        }
        boolean ispal=true;
        int left=0;
        int right=res.length()-1;
        while(left<=right){
            if(res.charAt(left)!=res.charAt(right)){
                ispal=false;

            }
            left++;
            right--;
        }
        return ispal;

    }
}