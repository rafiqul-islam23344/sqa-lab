from playwright.sync_api import sync_playwright
with sync_playwright() as playwright:
    # lunch browser
    browser = playwright.chromium.launch(headless=False, slow_mo=500)
    # create a new page
    page = browser.new_page()
    #visit the playwright website
    page.goto("https://playwright.dev/python/docs/intro")
    #locate a link element with "docs" text
    docs_button = page.get_by_role('link',name="Docs")
    docs_button.click()
    #get the url
    print("Docs:",page.url)
    browser.close()