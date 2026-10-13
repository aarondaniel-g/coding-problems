class Solution:
    def findKthPositive(self, arr: list[int], k: int) -> int:
        newarr=[]
        i=1
        while(len(newarr)<k):
            if i not in arr:
                newarr.append(i)
            i+=1
        
        return newarr[k-1]