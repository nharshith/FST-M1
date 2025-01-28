from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-content")
    wait = WebDriverWait(driver, 10)
    driver.maximize_window()
    print(f"Title of the page: {driver.title}")

    click_me_button = driver.find_element(By.ID, "genButton")
    word = driver.find_element(By.ID, "word")
		
    click_me_button.click()
    wait.until(EC.text_to_be_present_in_element((By.ID, "word"),"release"))

    print(f"Text displayed: {word.text}")