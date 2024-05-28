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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings"))
	 {
	WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/AllowCookiesButton'))
}

WebUI.click(findTestObject('ChangePassword/Page_classicculture/AccountButton'))

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Login/input_Create one_email'), GlobalVariable.UserName2)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Login/input_Create one_password'), GlobalVariable.Password2)

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Login/button_Login'))

WebUI.click(findTestObject('ChangePassword/Page_classicculture/AccountButton'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Account information/a_Change password'))

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_Current password_old_password'), 
    GlobalVariable.Password2)

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_New password_password'), 
    '2ihRrRfSAwg=')

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_Password confirmation_password_confirmation'), 
    '2ihRrRfSAwg=')

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Change Password/button_Change password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_Current password_old_password'), 
    '2ihRrRfSAwg=')

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_New password_password'), GlobalVariable.Password2)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_Password confirmation_password_confirmation'), 
    GlobalVariable.Password2)

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Change Password/button_Change password'))

WebUI.closeBrowser()

