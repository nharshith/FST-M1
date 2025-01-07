from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(f"Title of the page: {driver.title}")

    checkbox_element = driver.find_element(By.ID, "checkbox")

    if(checkbox_element.is_selected()):
        print("Checkbox is selected")
    else:
        print("Checkbox is not selected as expected")

    checkbox_element.click()

    if(checkbox_element.is_selected()):
        print("Checkbox is selected as expected")
    else:
        print("Checkbox is not selected")
