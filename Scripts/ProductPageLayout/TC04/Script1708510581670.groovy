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

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Crazystylezs/a_Women'))

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Crazystylezs/a_Traditional Wear'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Crazystylezs/a_Lehanga Choli'))

WebUI.scrollToPosition(0, 400)

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Lehanga Choli/a_Embroidered Semi-Stitched Lehenga Choli W_69179c'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Lehanga Choli/a_Embroidered Semi-Stitched Lehenga Choli W_69179c'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 200)

WebElement element =WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/ProductPageLayout/Product_lehenga'),
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

    



