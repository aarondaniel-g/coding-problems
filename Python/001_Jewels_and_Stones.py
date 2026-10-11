class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        s=list(jewels)
        cnt=0
        for i in stones:
            if i in s:
                cnt+=1
        return cnt