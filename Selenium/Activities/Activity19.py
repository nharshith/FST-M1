from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/alerts")
    print(f"Title of the page: {driver.title}")

    confirm_alert_button = driver.find_element(By.ID, "confirmation")
    confirm_alert_button.click()
    confirm_alert = driver.switch_to.alert
    print(f"Text from confirm alert: {confirm_alert.text}")
		
    confirm_alert.accept()
    result = driver.find_element(By.ID, "result").text
    print(f"Result: {result}")
		
    confirm_alert_button.click()
    confirm_alert.dismiss()
    result = driver.find_element(By.ID, "result").text
    print(f"Result: {result}")