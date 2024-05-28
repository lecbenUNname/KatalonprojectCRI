import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/headerproduct'))

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Products/a_Women'))

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Products/a_Traditional Wear'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Products/a_Lehanga Choli'))

WebUI.scrollToPosition(0, 300)

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Lehanga Choli/h2_Digital Floral Flared Semi- Stitched Leh_b97d54'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Lehanga Choli/a_Digital Floral Flared Semi- Stitched Lehe_b7f2b7'))
WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/ProductPageLayout/Rupees'),
	30)
highlightElement(element)
 
WebUI.closeBrowser()
 
void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')
 
	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)
 
	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)
	WebUI.takeScreenshot()
	WebUI.delay(1)
	
	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}
