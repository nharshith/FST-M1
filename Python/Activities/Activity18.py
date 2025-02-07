import pandas as pd

dataFrame = pd.read_csv("credentials.csv")

print("Full data: ")
print(dataFrame)

print("Usernames: ")
print(dataFrame["Usernames"])

print("Details of second row: ")
print(dataFrame["Usernames"][1], " | ", dataFrame["Passwords"][1])

print("Usernames sorted in ascending order: ")
print(dataFrame.sort_values('Usernames'))

print("Passwords sorted in descending order: ")
print(dataFrame.sort_values('Passwords',ascending=False))