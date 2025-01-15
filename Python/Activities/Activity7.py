numbers = []
sum = 0
size = int(input("Enter the size of the list: "))
print("Enter the numbers: ")
for i in range(1,size+1):
    numbers.append(int(input("")))

for number in numbers:
    sum = sum + number

print(f"List: {numbers}")
print(f"Sum of all the elements in a list: {sum}")