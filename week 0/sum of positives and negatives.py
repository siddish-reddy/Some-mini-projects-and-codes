list = []
len = int(input("Input the total length of list: "))
pstv_sum=0;
ngtv_sum=0;
print("Enter the array: ")
for i in range(0,len):
    list.append(int(input()))
print("Entered list is:")
for i in list:
    if i>0:
        pstv_sum+=i;
    else:
        ngtv_sum+=i;

print("Sum of entered positive numbers is :",pstv_sum,"\nSum of Negative nUmbers",ngtv_sum);



                
    

    
