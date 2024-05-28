import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Categories/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)


WebDriver driver = DriverFactory.getWebDriver()

WebUI.delay(2)
WebElement product = driver.findElement(By.xpath("(//a[contains(@href ,'products')]//i)[2]"))

product.click()

WebElement allCategories = driver.findElement(By.xpath('//div[@class="product-cat-label"]'))


if(allCategories.isDisplayed()) {
	
	KeywordUtil.markPassed("All categories dropdown is Displayed")
	
}else {
	
	      
	KeywordUtil.markFailed("All categories dropdownis Not Displayed")
	
}
WebUI.closeBrowser()
