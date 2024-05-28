import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.regex.Matcher

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
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

String cssmaxhgt = WebUI.getCSSValue(findTestObject('Object Repository/Filters/draggerBarByBrands'), 'max-height')

Matcher matcher = cssmaxhgt =~ '\\d+'

int numericValue = 0

if (matcher.find()) {
	numericValue = Integer.parseInt(matcher.group())
}

println(numericValue)

hightDragger = WebUI.getElementHeight(findTestObject('Object Repository/Filters/draggerBarByBrands'))

println(hightDragger)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> brandlist = DriverFactory.getWebDriver().findElements(By.xpath('//div[@id="mCSB_2_container"]//label'))

int numberOfElements = brandlist.size()

int numberOfDrag = numberOfElements / 20

println(numberOfDrag)

hightDragger = WebUI.getElementHeight(findTestObject('Object Repository/Filters/draggerBarByBrands'))

println(hightDragger)

for (int k = 0; k < numberOfDrag; k++) {
	println(k)

	WebUI.dragAndDropByOffset(findTestObject('Object Repository/Filters/draggerBarByBrands'), 0, hightDragger * k)
}

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

int Count = brandlist.size()

int elementCount = 0 // Initialize counter variable

for (WebElement categoryElement : brandlist) {
	String categoryNames = js.executeScript('return arguments[0].textContent;', categoryElement).toString()

	println("Category Names: $categoryNames")

	elementCount++
}

if (Count !== elementCount) {
	KeywordUtil.markFailed('count won\'t match')
}

println("Total number of elements: $elementCount")

WebUI.closeBrowser()