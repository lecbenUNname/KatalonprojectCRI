import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 250)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_classicculture/img_svgInject rounded-circle_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_classicculture/a_My Account'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_classicculture/a_My Account'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_classicculture/a_My Account'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'), 0)

WebUI.scrollToPosition(0, 150)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'))

WebUI.scrollToPosition(0, 200)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/input_dob'))

Actual_Dateformat = WebUI.getAttribute(findTestObject('Profiletab/Date_of_birth'), 'placeholder')

WebUI.verifyMatch('Actual_Dateformat', 'Excepted_Dateformat', false)

WebUI.takeScreenshot()

WebUI.closeBrowser()

