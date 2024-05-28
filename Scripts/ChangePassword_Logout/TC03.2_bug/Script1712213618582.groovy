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

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Change Password/Page_Change Password/input_Current password_old_password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Change Password/Page_Change Password/input_New password_password'), 
    'u/ClaDFB03ESvFiY4F53mw==')

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_Change Password/Page_Change Password/input_Password confirmation_password_confirmation'), 
    'ReHxgS/yEmY/mvoPT3WuAQ==')

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_Change Password/Page_Change Password/button_Change password'))

WebUI.takeScreenshot()

String alertText = WebUI.getText(findTestObject('Object Repository/ChangePassword/Page_Change Password/DangerAlert1'))

println(alertText)

String alertText1 = 'The new password and confirmation password must match'

println(alertText1)

if (alertText.contains(alertText1)) {
    println('Danger alert is valid.')
} else {
    println('Danger alert is invalid.')

    KeywordUtil.markFailed('This test case is intentionally marked as failed.')
}

WebUI.closeBrowser()

