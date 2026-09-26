class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        s=set(allowed)
        cnt=0
        for i in words:
            val=True
            for j in i:
                if j not in s:
                    val=False
                    break
            if(val):
                cnt+=1
        return cnt