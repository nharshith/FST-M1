from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-attributes")
    print(f"Title of the page: {driver.title}")

    full_name = driver.find_element(By.CSS_SELECTOR, "input[id^='full-name']")
    email = driver.find_element(By.CSS_SELECTOR, "input[id$='-email']")
    event_date = driver.find_element(By.XPATH, "//input[contains(@name, '-event-date-')]")
    details = driver.find_element(By.XPATH, "//textarea[contains(@id, '-additional-details-')]")
    submit = driver.find_element(By.XPATH, "//button[text()='Submit']")

    full_name.send_keys("abc")
    email.send_keys("abc@xyz.com")
    event_date.send_keys("2025-01-26")
    details.send_keys("Details")
    submit.click()
        
    result = driver.find_element(By.id("action-confirmation")).text
    print("Result: " +result)
        