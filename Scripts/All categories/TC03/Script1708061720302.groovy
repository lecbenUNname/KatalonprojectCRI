import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI




WebUI.callTestCase(findTestCase('All categories/CommonTestcases'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/All Categories/Categories_xpath'))

WebUI.click(findTestObject('Object Repository/All Categories/Categories_xpath'))

//WebUI.click(findTestObject('Object Repository/All Categories/Categories_click'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/All Categories/Categories_xpath'))
	
WebUI.closeBrowser()
