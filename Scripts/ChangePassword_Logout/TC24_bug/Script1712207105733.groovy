import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

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
    'ukeaNcD2sUJOstz9Pl47gQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_Password confirmation_password_confirmation'), 
    'ukeaNcD2sUJOstz9Pl47gQ==')

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Change Password/button_Change password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_Current password_old_password'), 
    'ukeaNcD2sUJOstz9Pl47gQ==')

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_New password_password'), GlobalVariable.Password2)

WebUI.setText(findTestObject('Object Repository/ChangePassword/Page_Change Password/input_Password confirmation_password_confirmation'), 
    GlobalVariable.Password2)

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Change Password/button_Change password'))

WebUI.takeScreenshot()

String url = WebUI.getUrl()

println(url)

if (url.equals('https://classicculture.in/login')) {
    println('Login page is redirects successfully after changing the password')
} else {
    println('Login page is not redirects successfully after changing the password')

    KeywordUtil.markFailed('This test case is intentionally marked as failed.')
}

WebUI.closeBrowser()

