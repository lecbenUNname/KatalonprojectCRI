import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
 
 

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/input_dob'))
 

LocalDate today = LocalDate.now()

// Format the date as needed (e.g., YYYY-MM-DD)
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
String currentDate = today.format(formatter)


WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_dob'), currentDate)

WebUI.click(findTestObject('Object Repository/Profiletab/Full_name_placeholder'))

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/SuccessALert'), 1,FailureHandling.OPTIONAL)

if (x== true) {
	KeywordUtil.markFailed()
}
WebUI.click(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'))

WebUI.closeBrowser()