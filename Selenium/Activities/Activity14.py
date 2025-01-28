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

    book_name = driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]").text
    print(f"Book name from 5 row: {book_name}")
		
    driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/thead/tr/th[5]").click()
    book_name = driver.find_element(By.XPATH, "//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]").text
    print(f"Book name from 5 row: {book_name}")