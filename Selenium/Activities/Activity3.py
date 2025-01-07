from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net")
    print(f"Title of the web page: {driver.title}")

    driver.find_element(By.XPATH,"//a[text() = 'About Us']").click()

    print(f"Title of the second web page: {driver.title}")

    driver.get("https://training-support.net/webelements/login-form")
    print(f"Title of the web page: {driver.title}")

    driver.find_element(By.XPATH, "//input[@id = 'username']").send_keys("admin")
    driver.find_element(By.XPATH, "//input[@id = 'password']").send_keys("password")
    driver.find_element(By.XPATH, "//button[text() = 'Submit']").click()

    driver.quit()

