list1 = [1,2,3,4,6,5,12,11]
list2 = [6,7,8,9,10,12]
list3 = []

for i in list1:
    if i % 2 != 0:
        list3.append(i)

for j in list2:
    if j % 2 == 0:
        list3.append(j)

print(f"New list: {list3}")
