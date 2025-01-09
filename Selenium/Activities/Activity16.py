from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(f"Title of the page: {driver.title}")

    drop_down = driver.find_element(By.XPATH, "//select[contains(@class, 'h-10')]")
		
    select = Select(drop_down)
		
    select.select_by_visible_text("Two")
    select.select_by_index(3)
    select.select_by_value("four")
		
    options = select.options
    print("Options : ")
    for option in options:
        print(option.text)


        