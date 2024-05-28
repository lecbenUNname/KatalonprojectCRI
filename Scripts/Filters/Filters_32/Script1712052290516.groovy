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

String cssmaxhgt = WebUI.getCSSValue(findTestObject('Filters/draggerBarTag'), 'max-height')

Matcher matcher = cssmaxhgt =~ '\\d+'

int numericValue = 0

if (matcher.find()) {
	numericValue = Integer.parseInt(matcher.group())
}

println(numericValue)

hightDragger = WebUI.getElementHeight(findTestObject('Filters/draggerBarTag'))

println(hightDragger)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> tagList = DriverFactory.getWebDriver().findElements(By.xpath('//div[@id="mCSB_3_container"]//span[1]'))
int numberOfElements = tagList.size()

int numberOfDrag = numberOfElements / 20

println(numberOfDrag)

hightDragger = WebUI.getElementHeight(findTestObject('Filters/draggerBarTag'))

println(hightDragger)

for (int k = 0; k < numberOfDrag; k++) {
    println(k)

    WebUI.dragAndDropByOffset(findTestObject('Object Repository/Filters/draggerBarTag'), 0, hightDragger * k)
}

JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

int Count = tagList.size()

int elementCount = 0 // Initialize counter variable

for (WebElement tagElement : tagList) {
    String tagNames = js.executeScript('return arguments[0].textContent;', tagElement).toString()

    println("Tag Names: $tagNames")

    elementCount++
}

if (Count !== elementCount) {
    KeywordUtil.markFailed('count won\'t match')
}

println("Total number of elements: $elementCount")