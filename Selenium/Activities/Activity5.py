from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(f"Title of the page: {driver.title}")

    checkbox_element = driver.find_element(By.ID, "checkbox")

    if(checkbox_element.is_displayed()):
        print("Checkbox is visible before clicking toggle button as expected")
    else:
        print("Checkbox is not visible before clicking toggle button")

    driver.find_element(By.XPATH,"//button[text() = 'Toggle Checkbox']").click()

    if(checkbox_element.is_displayed()):
        print("Checkbox is visible after clicking toggle button")
    else:
        print("Checkbox is not visible after clicking toggle button as expected")
