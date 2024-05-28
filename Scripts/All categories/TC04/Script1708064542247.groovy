import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
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

List<WebElement> list = driver.findElements(By.xpath("//select[@class='product-category-select']//option"))



StringBuilder textBuilder = new StringBuilder()

for (WebElement option : list) {
	
	String text = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].text;", option)
	
	textBuilder.append(text).append("\n")
}

String allTexts = textBuilder.toString()
println("Text of all elements:\n" + allTexts)


if(allTexts.equals("0")) {
	
	
	KeywordUtil.markFailed("Not matched")
}

WebUI.closeBrowser()