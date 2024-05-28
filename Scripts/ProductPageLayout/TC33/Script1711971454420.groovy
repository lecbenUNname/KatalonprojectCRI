import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()

if (URLTO.contains('crazystylezs') || URLTO.contains('myshopings')) {
	WebUI.click(findTestObject('ForgotPassword/Page_Crazystylezs/button_Allow cookies'))
}

WebUI.click(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/headerproduct'))

WebUI.setText(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/New Folder (1)/Page_Crazystylezs/input_All Categories_q'),'White Floral Georgette Maternity Maxi Dress')
	//GlobalVariable.Product_Page_LayoutSearchTestPro2)

WebUI.sendKeys(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/New Folder (1)/Page_Crazystylezs/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 400)

WebUI.scrollToPosition(0, 300)

WebUI.mouseOver(findTestObject('ProductPageLayout/Testing_product'))

WebUI.click(findTestObject('ProductPageLayout/Testing_product'))

//WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Common_product_image'))
//
//WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Common_product_image'))
WebUI.scrollToPosition(0, 800)


WebUI.verifyElementText(findTestObject('Signout/Testing Product/span_In stock'), 'In stock')

WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Signout/Testing Product/Span_Avl'),  30)

highlightElement(element)

boolean x =  WebUI.verifyElementPresent(findTestObject('Object Repository/Signout/Testing Product/Span_Avl'), 30, FailureHandling.OPTIONAL)
String k =  WebUI.getText(findTestObject('Signout/Testing Product/span_In stock'))
String y
if (x ==true){
	
	WebUI.click(findTestObject('Object Repository/ProductPageLayout/Size'))
	
	WebUI.scrollToPosition(0, 800)
	
	
	WebElement element2 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/Signout/Testing Product/Span_Avl'),
		30)
	
	highlightElement(element2)
	
	
	y =  WebUI.getText(findTestObject('Object Repository/Signout/Testing Product/Span_Avl'))
	
	
	
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

