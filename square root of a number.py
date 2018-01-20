import math

def guess(low, high, n,COUNT):
 
    if(COUNT<10):    #count for preventing stack overflow
        COUNT=COUNT+1
       
        mid=(low+high)/2
        print(str(COUNT),":low is", low, "high is", high,"with mid:",mid,"value is", mid**2)
        if mid**2==n:
              return mid
        elif (mid**2<n):
            return guess(mid, high,n,COUNT)
        else:
          return guess(low, mid, n,COUNT)

def sqrt(n):
    for i in range(0,int(n)):      #since given input can also be a float
        if(i**2 == n):
           return i;
        elif (i**2>n):
            break;
    return guess(i-1, i, n,0)    #since the result is in between them


n = float(input("Enter number: "))
print("from newtons method "+ str(sqrt(n)))
print("from math.sqrt result is "+ str(math.sqrt(n)))
