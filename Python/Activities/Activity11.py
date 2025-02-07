fruits_dict =	{
  "apple": 100,
  "orange": 80,
  "grapes": 75
}
print(fruits_dict)
fruit_input = input("What fruit do you need?")

if fruit_input in fruits_dict:
  print(f"{fruit_input} is avaialble")
else:
  print(f"{fruit_input} is not avaialble")