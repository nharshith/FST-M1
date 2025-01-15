numbers = []
size = int(input("Enter the size of the list: "))
print("Enter the numbers: ")
for i in range(1,size+1):
    numbers.append(int(input("")))

print(f"List: {numbers}")

if size <=1:
    print("Size should be more than 1")
else:
    if numbers[0] == numbers[size-1]:
        print("True")
    else:
        print("False")