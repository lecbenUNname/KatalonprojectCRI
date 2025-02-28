import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
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

WebUI.click(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/headerproduct'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('ProductPageLayout/Product_position'))

WebUI.scrollToPosition(0, 600)

//WebUI.clearText(findTestObject('Object Repository/ProductPageLayout/Page_Navy Blue Ethnic Motifs Pleated Keyhol_406269/input_Availability_qty'))
WebUI.setText(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/Input_Qty'), '80')

WebUI.click(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/Add To Cart'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('ProductPageLayout/Product_Cancel_Button'))

try {
    WebUI.verifyElementPresent(findTestObject('OverView/Alertmessage'), 0)
}
catch (Exception E) {
    KeywordUtil.markFailed('No validate toaster message')

   
} 
WebUI.scrollToPosition(0, 50)
WebUI.mouseOver(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/Cart'))

WebUI.click(findTestObject('ProductPageLayout/Product_Cancel_Button'))

WebUI.closeBrowser()

