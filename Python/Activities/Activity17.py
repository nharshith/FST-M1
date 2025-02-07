import pandas as pd

credentials = {
    "Usernames": ["admin","Charles","Deku"],
    "Passwords": ["password","Charl13","AllMight"]
}

dataFrame = pd.DataFrame(credentials)

print(dataFrame)

dataFrame.to_csv("credentials.csv",index=False)