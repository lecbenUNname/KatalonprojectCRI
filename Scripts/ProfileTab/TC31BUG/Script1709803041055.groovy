import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 250)

String a='-987654321'

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_phone'), a)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

String b = WebUI.getText(findTestObject('Object Repository/Profiletab/Page_Profile/input_phone'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/DangerAlert'), 1, FailureHandling.OPTIONAL)

println (x)

if (x != true) {
	KeywordUtil.markFailed()
}
WebUI.closeBrowser()