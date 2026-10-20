class Solution(object):
    def isPowerOfTwo(self, n):
        pow=1
        while pow<n:
            pow=pow*2

        if pow==n:
            return True
        else:
            return False