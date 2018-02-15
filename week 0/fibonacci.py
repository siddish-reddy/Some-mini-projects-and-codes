n= int(input("How many fibonacci numbers do you want:"))
a=0;
b=1;
print("Fibonacci numbers are:\n",a,"\n",b)
for i in range(0,n-2):
    fib=a+b
    a=b
    b=fib
    print(b)
    
