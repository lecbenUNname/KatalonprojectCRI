import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/New Folder (1)/Page_Crazystylezs/input_All Categories_q'), GlobalVariable.Product_Page_LayoutSearchTestPro2)
WebUI.sendKeys(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/New Folder (1)/Page_Crazystylezs/input_All Categories_q'), Keys.chord(Keys.ENTER))
WebUI.scrollToPosition(0, 500)
WebUI.mouseOver(findTestObject('ProductPageLayout/Testing_product'))
WebUI.click(findTestObject('ProductPageLayout/Testing_product'))
WebUI.scrollToPosition(0, 1000)

WebUI.delay(3)

WebUI.click(findTestObject('ProductPageLayout/Page_Testing Product/button_Buy Now'))

WebUI.closeBrowser()

