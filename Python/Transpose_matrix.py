class Solution(object):
    def transpose(self, matrix):
        n=len(matrix)
        m=len(matrix[0])
        total=[]
        for i in range(m):
            tot=[]
            for j in range(n):
                tot.append(matrix[j][i])
            total.append(tot)
        return total



        