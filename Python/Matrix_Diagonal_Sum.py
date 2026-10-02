class Solution(object):
    def diagonalSum(self, mat):
        n=(len(mat))
        tot=0
        for i in range(n):
            tot+=mat[i][i]
        for j in range(n):
            tot+=mat[j][n-j-1]
        if n%2==1:
            tot-=mat[n//2][n//2]
        return tot
        