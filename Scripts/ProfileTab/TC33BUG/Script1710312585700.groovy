import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'), 0)

WebUI.scrollToPosition(0, 150)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'))

WebUI.scrollToPosition(0, 250)

String actualText=WebUI.getText(findTestObject('Object Repository/Profiletab/Page_Profile/input_phone'))

WebUI.clearText(findTestObject('Object Repository/Profiletab/Page_Profile/input_phone'))

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.delay(3)

String a = WebUI.getText(findTestObject('Object Repository/Profiletab/Page_Profile/input_phone'))
if (actualText.contains(a))  
{
	KeywordUtil.markFailed("fail")
	WebUI.closeBrowser();
}
WebUI.closeBrowser()