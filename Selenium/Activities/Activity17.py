from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/selects")
    print(f"Title of the page: {driver.title}")

    drop_down = driver.find_element(By.XPATH, "//select[contains(@class, 'h-80')]")
		
    multi_select = Select(drop_down)
		
    multi_select.deselect_by_index(0)
    multi_select.select_by_visible_text("HTML")
    multi_select.select_by_index(3)
    multi_select.select_by_index(4)
    multi_select.select_by_index(5)
    multi_select.select_by_value("nodejs")
    multi_select.deselect_by_index(4)
		
    selectedOptions = multi_select.all_selected_options
    print("Selected options are: ")
    for option in selectedOptions:
        print(option.text)