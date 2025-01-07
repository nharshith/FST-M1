from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")
    print(f"Title of the web page: {driver.title}")

    driver.find_element(By.LINK_TEXT,"About Us").click()

    print(f"Title of the second web page: {driver.title}")
