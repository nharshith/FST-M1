def sum_of_numbers(num):
  if num>=0:
    return num + sum_of_numbers(num-1)
  else:
    return 0

res = sum_of_numbers(100)

print(res)