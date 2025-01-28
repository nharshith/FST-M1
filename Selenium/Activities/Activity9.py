from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/keyboard-events")
    action = ActionChains(driver)
    driver.maximize_window()
    print(f"Title of the page: {driver.title}")

    textArea = driver.find_element(By.XPATH, "//h1[contains(@class, 'mt-3')]")

    action.send_keys("Selenium Test").perform()

    result = textArea.text
    print(f"Text displayed on the webpage: {result}")