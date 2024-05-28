import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
WebUI.callTestCase(findTestCase('Company/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.click(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.delay(2)

findTestObject('Object Repository/Company/Company_About us breadcrums')

WebUI.scrollToPosition(0, 700)

WebUI.waitForElementPresent(findTestObject('Object Repository/Company/Page_Contact/input_name'), 0)

WebUI.setText(findTestObject('Object Repository/Company/Company_name'), '      good')

WebUI.setText(findTestObject('Object Repository/Company/Company_Email'), 'Good@gmail.com')



WebUI.setText(findTestObject('Object Repository/Company/Company_Address'), '      good')

WebUI.setText(findTestObject('Object Repository/Company/Company_phonenumber'), '        c@#$Good@gmail.com')


WebUI.setText(findTestObject('Object Repository/Company/Company_subject'), '             Good')

WebUI.setText(findTestObject('Object Repository/Company/Company_content'), '             Good')

WebUI.click(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Page_Contact/button_Send message'))

WebUI.mouseOver(findTestObject('Object Repository/Company/Company_ToastersuccessfullyToaster'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_ToastersuccessfullyToaster'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Company/Company_ToastersuccessfullyToaster'), 0)) {
    KeywordUtil.markFailed('name field accepts single character')
	WebUI.closeBrowser()
	
}
else
{
	WebUI.closeBrowser()
	
}

