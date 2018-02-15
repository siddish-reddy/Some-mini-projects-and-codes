list = []
len = int(input("Input the total length of list: "))
print("Enter the sorted array elements: ")
for i in range(0,len):
    list.append(int(input()))
list.sort();
key = int(input("enter the key to search:"));
lo = 0
hi = len - 1
found=False
while hi >= lo:
    mid = (lo +hi)// 2
    if list[mid] < key:
        lo = mid + 1
    elif list[mid] > key:
        hi = mid - 1
    else:
        print("Key found at: ",mid)
        found=True
        break;
if(not found):
    print("Key not found in array");
