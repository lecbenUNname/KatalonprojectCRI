import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

CustomKeywords.'com.helper.common.CommonMethod.logIntoApplication'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.click(findTestObject('Filters/Filter_Button'))

WebUI.scrollToPosition(0, 300)

WebDriver driver = DriverFactory.getWebDriver()

WebElement tag = driver.findElement(By.xpath('//div[@id="mCSB_3_container"]//label[@for="tag-filter-6"]//span[1]'))

String tagFilterName = tag.getText()
tag.click()

WebElement filterButton = driver.findElement(By.xpath('//button[@class="btn btn-sm btn-default"]'))

filterButton.click()
WebUI.delay(2)
WebUI.scrollToPosition(0, 500)
WebElement product = driver.findElement(By.xpath('(//img[@class="default-img"])[1]'))
product.click()

WebUI.scrollToPosition(0, 700)

WebElement productTagName = driver.findElement(By.xpath('(//li[@class="mb-5"]//a)[2]'))

String tagName = productTagName.getText()
println(tagName)

productTagName.click()

WebElement tagName2 = driver.findElement(By.xpath('//div[@class="breadcrumb-item d-inline-block active"]'))

String breadcrumbTagName = tagName2.getText()

println(breadcrumbTagName)

if(breadcrumbTagName.containsIgnoreCase(tagName)) {
	
	KeywordUtil.markPassed("The Tag Name Matched ")
	
}else {
	
	KeywordUtil.markFailed("The Tag Name Not Matched ")
}

WebUI.closeBrowser()