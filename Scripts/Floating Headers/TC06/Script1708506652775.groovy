import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Floating Headers/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.mouseOver(findTestObject('Object Repository/Floating Headers/Floating_Product'))


CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Floating Headers/Floating_Product'))


CustomKeywords.'com.helper.common.Common_Helper.highlightElement'findTestObject('Object Repository/Floating Headers/Floating_submenu')

WebUI.closeBrowser()