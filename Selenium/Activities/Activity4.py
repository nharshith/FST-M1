from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/target-practice")

    third_header_text = driver.find_element(By.XPATH, "//h3[contains(text(), '#3')]").text
    print(f"Third header text: {third_header_text}")

    fifth_header_color = Color.from_string(driver.find_element(By.XPATH, "//h5[contains(text(), '#5')]").value_of_css_property("color"))
    print(f"RGB of fifth header: {fifth_header_color.rgb}")
    print(f"Hex value of fifth header: {fifth_header_color.hex}")

    purple_button_classes = driver.find_element(By.CLASS_NAME, "bg-purple-200").get_dom_attribute("class")
    print(f"Classes of purple button: {purple_button_classes}")

    slate_button_text = driver.find_element(By.CLASS_NAME, "bg-slate-200").text
    print(f"Slate button text: {slate_button_text}")
