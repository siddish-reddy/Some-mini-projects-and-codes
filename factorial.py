def fact(n):
    if n == 0:
        return 1
    else :
        return n*fact(n-1)

n = input("enter a number: ")
x = fact(int(n))
print("factorial of",n,"is"+ str(x))