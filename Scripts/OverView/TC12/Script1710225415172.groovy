import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.click(findTestObject('OverView/Page_Crazystylezs/a_My Account'))

WebUI.mouseOver(findTestObject('OverView/Fileuploadimagexpath'))

WebUI.click(findTestObject('OverView/Fileuploadimagexpath'))
String path = System.getProperty("user.dir")
String modifiedPath = path.replaceAll("\\\\", "\\\\\\\\")
 
String pass = modifiedPath+'\\Data files\\Overviewpxfuel.jpg'

WebUI.sendKeys(findTestObject('OverView/FileUpload'), pass)

WebUI.click(findTestObject('OverView/SaveButtonn'))
WebUI.takeScreenshot()

try {
	WebUI.verifyElementPresent(findTestObject('OverView/Success Toaster message'), 0)
}
catch (Exception E) {
    KeywordUtil.markFailed('No validate toaster message')
} 

WebUI.closeBrowser()

