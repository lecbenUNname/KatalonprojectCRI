import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Categories/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Categories/Categories_Accessories'))

WebUI.click(findTestObject('Object Repository/Categories/Categories_Accessories'))


CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Categories/Categories_breadcrums'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Categories/Categories_headerAccessories'))

WebUI.closeBrowser()