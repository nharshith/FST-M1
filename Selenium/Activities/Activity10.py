from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/drag-drop")
    action = ActionChains(driver)
    driver.maximize_window()
    print(f"Title of the page: {driver.title}")

    ball = driver.find_element(By.XPATH, "//img[@id='ball']")
    drop_zone1 = driver.find_element(By.XPATH, "//div[@id='dropzone1']")
    drop_zone2 = driver.find_element(By.XPATH, "//div[@id='dropzone2']")
		
    action.click_and_hold(ball).pause(2).move_to_element(drop_zone1).release().perform()
		
    drop_zone1_text = drop_zone1.text
    if drop_zone1_text == "Dropped!":
        print("Ball was dropped in Dropzone 1")
		
    action.click_and_hold(ball).pause(2).move_to_element(drop_zone2).release().perform()
		
    drop_zone2_text = drop_zone2.text
    if drop_zone2_text == "Dropped!":
        print("Ball was dropped in Dropzone 2")