a=[]
n=int(input("Enter the No.of Elements :"))
for j in range(n):
    a.append(int(input()))
for i in range(n):
    k=i
    for j in range(i+1,n):
        if a[j]<a[i]:
            k=j
    a[i],a[j]=a[j],a[i]
    print("List after ",i," iteration : ",a)
print("Sorted List : ",a)
