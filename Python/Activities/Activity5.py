number = int(input("Enter a number: "))
print(f"Multiplication table of {number}")
for i in range(1,11):
    result = str(number*i)
    print(f"{number} X {i}  = {result}")