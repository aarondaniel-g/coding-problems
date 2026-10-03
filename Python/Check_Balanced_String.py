class Solution:
    def isBalanced(self, num: str) -> bool:
        left=0
        right=0
        for i in range(len(num)):
            if i%2==0:
                left+=int(num[i])
            else:
                right+=int(num[i])
        if(left==right):
            return True
        return False
        
            
            