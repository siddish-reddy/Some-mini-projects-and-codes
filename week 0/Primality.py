def isPrime(n):
    if (n <= 1)  return False;
    if (n <= 3)  return True;
    if (n%2 == 0 or n%3 == 0) return False;
    """ for i in range(2, n//2):
            if (n%i==0):
                return False; 
    is normal version we learnt """
    
    i=5
    w=2
    while i*i<= n:
        if n % i == 0:
            return False
        i += w
        w = 6 - w
    return True
"""It's a variant of the classic O(sqrt(N)) algorithm. 
It uses the fact that a prime (except 2 and 3) is of form 6k - 1 or 6k + 1 and looks only at divisors of this form
https://stackoverflow.com/questions/1801391/what-is-the-best-algorithm-for-checking-if-a-number-is-prime"""

n = int(input("Enter the number to check whether it is prime or not: "))
if isPrime(n):
    print("entered number is prime ")
else: print("entered number is not a prime ")

