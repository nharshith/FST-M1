def sum(numbers):
    sum = 0
    for num in numbers:
        sum = sum + num
    return sum


numbers = [12, 14, 15]

res = sum(numbers)

print(res)