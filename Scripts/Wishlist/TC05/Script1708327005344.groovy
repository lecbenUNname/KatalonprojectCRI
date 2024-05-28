import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 0)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Wishlist/Page_Crazystylezs/div_Hot                                    _649160'))
try
{

WebUI.verifyElementPresent(findTestObject('Wishlist/wishlist button'), 0)
}
catch(Exception e)
{
	KeywordUtil.markFailed("FAiled because wishlist button is nopt there")
}
WebUI.scrollToPosition(0, 1000)

//WebUI.click(findTestObject('Wishlist/Header3'))

WebUI.closeBrowser()

