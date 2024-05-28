import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Company/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.click(findTestObject('Object Repository/Company/Page_Crazystylezs/span_Contact us'))

WebUI.delay(2)

findTestObject('Object Repository/Company/Company_About us breadcrums')

WebUI.scrollToPosition(0, 700)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Company/Company_Dropusline'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Company/Company_Dropusline'),2)

WebUI.closeBrowser()