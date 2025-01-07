from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    print(f"Title of the page: {driver.title}")

    text_input = driver.find_element(By.ID, "textInput")

    if(text_input.is_enabled()):
        print("Input field is enabled")
    else:
        print("Input field is disabled as expected")

    driver.find_element(By.ID, "textInputButton").click()

    if(text_input.is_enabled()):
        print("Input field is enabled as expected")
    else:
        print("Input field is disabled")
