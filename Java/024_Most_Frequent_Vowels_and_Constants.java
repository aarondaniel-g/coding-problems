class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26+1];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int vow=0;
        int cons=0;
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if(ch=='a' || ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
                vow=Math.max(freq[i],vow);
            }
            else{
                cons=Math.max(freq[i],cons);
            }
        }
        return vow+cons;
    }
}