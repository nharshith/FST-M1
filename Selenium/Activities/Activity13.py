from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tables")
    driver.maximize_window()
    print(f"Title of the page: {driver.title}")

    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr")
    print(f"Number of rows: {len(rows)}")

    cols = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/thead/tr/th")
    print(f"Number of columns: {len(cols)}")

    third_row = driver.find_elements(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[3]/td")

    print("Third row values: ")
    for cell in third_row :
        print(cell.text)

    second_cell = driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]")

    print(f"Second row second column value: {second_cell.text}")