import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_name'), '')

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

String Ax = WebUI.getAttribute(findTestObject('Object Repository/Profiletab/Full_name_placeholder'), 'validationMessage')
String Ex = 'Please fill out this name field.'

if (Ax == (Ex))
{
	KeywordUtil.markPassed("")
}
else
{
	KeywordUtil.markFailed("Incorect Validation message")
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

