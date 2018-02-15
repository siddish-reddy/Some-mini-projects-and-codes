list = []
len = int(input("Input the total length of list: "))
print("Enter the array elements: ")
for i in range(0,len):
    list.append(int(input()))
max=list[0]
for i in list:
    if i>max:
        max=i

print("Maximum number in given list is: ",max);



                
    

    
