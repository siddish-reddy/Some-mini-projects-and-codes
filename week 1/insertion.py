l=[]
n=int(input("Enter the No.of Elements :"))
for j in range(n):
    l.append(int(input()))
for i in range(1,n):
    temp=l[i]
    j=i-1
    while j!=-1 and l[j]>temp:
            l[j+1]=l[j]
            j=j-1  
    l[j+1]=temp
    print("List after ",i," iteration : ",l)
print("Sorted List : ",l)
