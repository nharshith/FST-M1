from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/mouse-events")
    action = ActionChains(driver)
    print(f"Title of the page: {driver.title}")

    cargo_lock = driver.find_element(By.XPATH, "//h1[text()='Cargo.lock']")
    cargo_toml = driver.find_element(By.XPATH, "//h1[text()='Cargo.toml']")
    src_button = driver.find_element(By.XPATH, "//h1[text()='src']")
    target_button = driver.find_element(By.XPATH, "//h1[text()='target']")

    action.click(cargo_lock).pause(1).move_to_element(cargo_toml).pause(1).click(cargo_toml).perform()

    result = driver.find_element(By.ID, "result").text
    print(f"Result: {result}")

    action.double_click(src_button).pause(1).pause(1).context_click(target_button).pause(1).perform()

    open_menu_item = driver.find_element(By.XPATH, "//span[text() = 'Open']")
    action.click(open_menu_item).pause(1).perform()

    result = driver.find_element(By.ID, "result").text
    print(f"Result: {result}")





