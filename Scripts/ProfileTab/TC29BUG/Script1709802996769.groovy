import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 250)



WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_phone'),'!@@#$$%%^')

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

String a=WebUI.getText(findTestObject('Object Repository/Profiletab/DangerAlert'))

println(a)

String E="The phone number field is in invalid format"

if(a != E)
{
	KeywordUtil.markFailed("fail")
}
WebUI.closeBrowser()