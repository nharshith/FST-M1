from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/tabs")
    wait = WebDriverWait(driver, 10)
    print(f"Title of the page: {driver.title}")

    print(f"Current window: {driver.current_window_handle}")
    driver.find_element(By.XPATH, "//button[text() = 'Open A New Tab']").click()
    wait.until(EC.number_of_windows_to_be(2))
		
    window_handles = driver.window_handles
    print("Window handles: {window_handles}")
		
    for window in window_handles:
        driver.switch_to.window(window)
		
    print(f"Title of new page: {driver.title}")
		
    driver.find_element(By.XPATH, "//button[text() = 'Open Another One']").click()
    wait.until(EC.number_of_windows_to_be(3))
		
    window_handles = driver.window_handles
    print("Window handles: {window_handles}")
		
    for window in window_handles:
        driver.switch_to.window(window)
		
    print(f"Title of new page: {driver.title}")