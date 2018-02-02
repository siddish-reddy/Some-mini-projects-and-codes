n=int(input("Enter the number:"))   
A=1  #approximation 
for i in range(1,10):
   A=(A+n/A)/2   #newton's approxmation for the calculation of sq root 
print("sq root of ",n,"is", A)
