def fact(n):    #this is basic version of finding factorial of a number go to https://www.geeksforgeeks.org/factorial-large-number/ for large numbers
    if n == 0:
        return 1
    else :
        return n*fact(n-1)

n = input("enter a number: ")
x = fact(int(n))
print("factorial of",n,"is"+ str(x))


#iterative method -------------------------


n= int(input("enter a number: "))
fact=1;
if(fact>1):
    for i in range(1,f+1):
        fact=fact*i;
print("factorial of ",n," is ",fact)
