class Solution(object):
    def fizzBuzz(self, n):
        num=[]
        for i in range(1,n+1):
            if i%3==0 and i%5==0:
                i="FizzBuzz"
            elif i%5==0:
                i="Buzz"
            elif i%3==0:
                i="Fizz"
            num.append(str(i))
        return num
       