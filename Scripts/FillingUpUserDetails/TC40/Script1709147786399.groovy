import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('FillingUpUserDetails/CommonFillingUpUserDetails/NavToRegisterPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/input_Register_password_confirmation'), 0)

WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/button_Register'))

WebUI.scrollToPosition(0, 310)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('FillingUpUserDetail/FillingUpUserDetails/Page_Register/formContent'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/AlertContainer'))

List<WebElement> alertElements = WebUI.findWebElements(findTestObject('Object Repository/FillingUpUserDetail/FillingUpUserDetails/Page_Register/AlertContainer'), 0)

for (WebElement alertElement : alertElements) {
	// Here, we can check if the alert element is displayed
	if (alertElement.isDisplayed()) {
		println("Alert is present: ${alertElement.getText()}")
	} else {
		println("Alert is not present.")
	}
}
WebUI.delay(3)

WebUI.closeBrowser()