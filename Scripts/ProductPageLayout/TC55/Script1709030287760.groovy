import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.model.FailureHandling as FailureHandling

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/headerproduct'))
WebUI.scrollToPosition(0, 300)

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Product_Image'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Product_Image'))

WebUI.scrollToPosition(0, 1300)

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/a_Reviews (11)'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 1900)

WebUI.closeBrowser()


