import pandas as pd

dataframe = pd.read_excel("activity19.xlsx")

print(dataframe)

tuple = dataframe.shape
print(f"Number of rows: {tuple[0]}")
print(f"Number of columns: {tuple[1]}")

print("Email IDs: ")
print(dataframe["Email"])

print(dataframe.sort_values("FirstName"))