import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import com.google.common.collect.FilteredEntryMultimap.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('ProductPageLayout/Common_PPL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 300)

WebUI.mouseOver(findTestObject('ProductPageLayout/Testing_product'))

WebUI.click(findTestObject('ProductPageLayout/Testing_product'))

//WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Common_product_image'))
//
//WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Common_product_image'))
WebUI.scrollToPosition(0, 800)


WebUI.verifyElementText(findTestObject('Signout/Testing Product/span_In stock'), 'In stock')

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Signout/Testing Product/span_In stock'), 
    30)

highlightElement(element)


boolean x =  WebUI.verifyElementPresent(findTestObject('Signout/Testing Product/span_In stock'), 30, FailureHandling.OPTIONAL)
String k =  WebUI.getText(findTestObject('Signout/Testing Product/span_In stock'))
String y
if (x ==true){
	
	WebUI.click(findTestObject('Object Repository/ProductPageLayout/Size'))
	
	WebUI.scrollToPosition(0, 800)
	
	
	WebElement element2 = WebUiBuiltInKeywords.findWebElement(findTestObject('Signout/Testing Product/span_In stock'),
		30)
	
	highlightElement(element2)
	
	
	y =  WebUI.getText(findTestObject('Signout/Testing Product/span_In stock'))
	
	
	
}


if(k!=y) {
	KeywordUtil.markFailed("")
}

WebUI.closeBrowser()















void highlightElement(WebElement element) {
    String originalStyle = element.getAttribute('style')

    JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

    WebUI.delay(1)

    js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

