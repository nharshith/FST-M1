from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/dynamic-controls")
    wait = WebDriverWait(driver, 10)
    driver.maximize_window()
    print(f"Title of the page: {driver.title}")


    checkbox = driver.find_element(By.ID, "checkbox")
    toggle_checkbox = driver.find_element(By.XPATH, "//div[@id='checkboxDiv']//following-sibling::button")
	
    toggle_checkbox.click()
    wait.until(EC.invisibility_of_element_located(driver.find_element(By.ID, "checkbox")))
    toggle_checkbox.click()
    wait.until(EC.element_to_be_clickable(driver.find_element(By.ID, "checkbox")))

    checkbox.click()