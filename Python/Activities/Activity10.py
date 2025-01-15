#number_tuple = (23,45,65,84, 100, 5)

size = int(input("Enter the number of elements: "))
list1 = []
flag = False

print(f"Enter {size} numbers: ")
for i in range(0,size):
    number = int(input(""))
    list1.append(number)

number_tuple = tuple(list1)

print("Numbers divisible by 5 from the tuple: ")
for num in number_tuple:
    if num % 5 == 0:
        print(num)
        flag = True