class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[t.charAt(i)-'a']++;
            freq[s.charAt(i)-'a']--;
        }
        boolean found=true;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                found=false;
            }
        }
        if(found){
            return true;
        }
        else{
            return false;
        }
    }
}