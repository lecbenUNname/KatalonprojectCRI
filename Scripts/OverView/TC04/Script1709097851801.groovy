import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Object Repository/OverView/Page_Crazystylezs/a_My Account'))

WebUI.click(findTestObject('Object Repository/OverView/Page_Crazystylezs/a_My Account'))

DriverFactory.getWebDriver().navigate().back()

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.mouseOver(findTestObject('Object Repository/OverView/Page_Account information/a_My Wishlist'))

WebUI.click(findTestObject('Object Repository/OverView/Page_Account information/a_My Wishlist'))

DriverFactory.getWebDriver().navigate().back()

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.mouseOver(findTestObject('Object Repository/OverView/Page_Wishlist/a_Update profile'))

WebUI.click(findTestObject('Object Repository/OverView/Page_Wishlist/a_Update profile'))

DriverFactory.getWebDriver().navigate().back()

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.click(findTestObject('Object Repository/OverView/Page_Profile/a_Sign out'))

WebUI.closeBrowser()

