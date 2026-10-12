class Solution(object):
    def isPalindrome(self, x):
        orginal=x
        rev=0
        while x>0:
           digit=x%10
           rev=rev*10+digit
           x=x//10
        if orginal==rev:
            return True
        elif  x<0:
            return False
        else:
            return False
