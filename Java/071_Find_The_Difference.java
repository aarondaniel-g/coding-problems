class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        for(int i=0;i<s.length();i++){
            sum1+=((int)s.charAt(i));
        }
        int sum2=0;
        for(int j=0;j<t.length();j++){
            sum2+=(int)(t.charAt(j));
        }
        char ch=(char)(sum2-sum1);
        return ch;
    }
}