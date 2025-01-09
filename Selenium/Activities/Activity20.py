from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/alerts")
    print(f"Title of the page: {driver.title}")

    driver.find_element(By.ID, "prompt").click()
    prompt_alert = driver.switch_to.alert
    print("Text from prompt alert: " +prompt_alert.text)
		
    prompt_alert.send_keys("Awesome!")
    prompt_alert.accept()
		
    result = driver.find_element(By.ID, "result").text
		
    print("Result: " +result)