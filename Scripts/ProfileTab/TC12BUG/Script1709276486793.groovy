import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/Page_Profile/label_Full Name'), 0)

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Profiletab/Page_Profile/label_Full Name'), 
    30)

highlightElement(element1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/Page_Profile/label_Date of birth'), 0)

WebElement element2 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Profiletab/Page_Profile/label_Date of birth'), 
    30)

highlightElement(element2)

WebUI.scrollToPosition(0, 250)

WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/Page_Profile/label_Phone'), 0)

WebElement element3 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Profiletab/Page_Profile/label_Phone'), 
    30)

highlightElement(element3)

WebUI.takeScreenshot()


if (WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/Page_Profile/label_Phone'), 0)) {
	KeywordUtil.markFailed('The phone number field not have the mandatory star ')
}

WebUI.closeBrowser()


WebUI.closeBrowser()
void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')

	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

	WebUI.delay(1)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}
