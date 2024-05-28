import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



 

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/input_dob'))

//String placeholder = WebUI.getText('Object Repository/Profiletab/Page_Profile/input_dob')
//println(placeholder)
 
//@Keyword
//def String placeholder = WebUI.getPlaceholderText(findTestObject('Object Repository/Profiletab/Page_Profile/input_dob'))
// {
//	return WebUI.getAttribute(to, 'placeholder')
//}

LocalDate today = LocalDate.now()


LocalDate Future = today.plusDays(1)


// Format the date as needed (e.g., YYYY-MM-DD)
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
String FutureDate = Future.format(formatter)

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Profile/input_dob'), FutureDate)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Profiletab/SuccessALert'), 0)) {
	KeywordUtil.markFailed()
}


WebUI.closeBrowser()