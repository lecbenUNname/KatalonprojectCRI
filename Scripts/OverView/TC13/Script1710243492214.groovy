import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('CommonTestCases/mouseoveruserimage'))

WebUI.click(findTestObject('OverView/Page_Crazystylezs/a_My Account'))

WebUI.mouseOver(findTestObject('OverView/Fileuploadimagexpath'))

WebUI.click(findTestObject('OverView/Fileuploadimagexpath'))
String path = System.getProperty("user.dir")
String modifiedPath = path.replaceAll("\\\\", "\\\\\\\\")
String pass = modifiedPath+'\\Data Files\\Overviewpxfuel.jpg'

WebUI.sendKeys(findTestObject('OverView/FileUpload'), pass)

WebUI.click(findTestObject('OverView/Cancelbutton'))

WebUI.mouseOver(findTestObject('OverView/Fileuploadimagexpath'))

WebUI.click(findTestObject('OverView/Fileuploadimagexpath'))

WebUI.takeScreenshot()
try {
    WebUI.verifyElementNotPresent(findTestObject('OverView/Fileuploadwithimage'), 0)
}
catch (Exception e) {
    KeywordUtil.markFailed('Element not found ')
} 

WebUI.closeBrowser()



