import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('All categories/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

WebElement allCategories = driver.findElement(By.xpath('//select[@class="product-category-select"]'))

allCategories.click()

WebElement productCategory = driver.findElement(By.xpath('(//select[@class="product-category-select"])//option[5]'))
productCategory.click()

String text = productCategory.getText().trim()
println(text)

WebElement search = driver.findElement(By.xpath('(//input[@placeholder="Search for items..."])[1]'))

search.click()

search.sendKeys(Keys.ENTER)

List<WebElement> list = driver.findElements(By.xpath("(//div[@class='product-category'])[1]"))
String categoriesName = ""
for(WebElement textCategory:list) {
	
	 categoriesName = textCategory.getText()
	
	println(categoriesName)
		
}

if(categoriesName.contains(text)) {
	
	KeywordUtil.markPassed("Product is Matched")
	
	
}else {
	
	KeywordUtil.markFailedAndStop("Product is Not Matched")
}

driver.quit()