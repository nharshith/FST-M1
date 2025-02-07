import pandas as pd
from pandas import ExcelWriter

details = {
    "FirstName": ["Satvik","Avinash","Lahri"],
    "LastName": ["Shah","Kati","Rath"],
    "Email": ["satshah@example.com","avinashk@example.com","lahri.rath@example.com"],
    "PhoneNumber": ["4537829158","5892184058","4528727830"]
}

dataFrame = pd.DataFrame(details)

print(dataFrame)

writer = ExcelWriter('activity19.xlsx')
dataFrame.to_excel(writer, 'Sheet1', index = False)

writer.close()