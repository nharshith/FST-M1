from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/popups")
    wait = WebDriverWait(driver, 10)
    print(f"Title of the page: {driver.title}")

    driver.find_element(By.ID, "launcher").click()
    wait.until(EC.element_to_be_clickable(driver.find_element(By.ID, "username")))
		
    driver.find_element(By.ID, "username").send_keys("admin")
    driver.find_element(By.ID, "password").send_keys("password")
    driver.find_element(By.XPATH, "//button[text() = 'Submit']").click()
		
    result = driver.find_element(By.CSS_SELECTOR, "h2.text-center").text
    print(f"Result: {result}")

