import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CommonLoginPage/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/headerproduct'))

WebUI.scrollToPosition(0, 300)

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Products/a_Navy Blue Ethnic Motifs Pleated Keyhole Neck Top'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Products/a_Navy Blue Ethnic Motifs Pleated Keyhole Neck Top'))

WebUI.scrollToPosition(0, 700)

WebUI.setText(findTestObject('Object Repository/ProductPageLayout/Page_Navy Blue Ethnic Motifs Pleated Keyhol_406269/input_Availability_qty'), 
    '99')

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Navy Blue Ethnic Motifs Pleated Keyhol_406269/button_Add to cart'))

WebUI.takeScreenshot()

try {
    WebUI.verifyElementPresent(findTestObject('OverView/Alertmessage'), 0)
}
catch (Exception E) {
    KeywordUtil.markFailed('No validate toaster message')
} 

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Navy Blue Ethnic Motifs Pleated Keyhol_406269/span_99'))

WebUI.click(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Blue Floral Printed Maxi Dress/Page_Crazystylezs/i_Rs.999.00_fi-rs-cross-small'))

WebUI.closeBrowser()

