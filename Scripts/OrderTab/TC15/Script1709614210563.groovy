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

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Login/input_Create one_email'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Login/input_Create one_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Login/button_Login'))

WebUI.click(findTestObject('ChangePassword/Page_classicculture/AccountButton'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Account information/a_Orders'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Orders/td_Completed'), 0)

statusOne = WebUI.getText(findTestObject('Object Repository/OrderTab/Page_Orders/td_Completed'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/a_View'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/strong_Completed'), 0)

statusTwo = WebUI.getText(findTestObject('Object Repository/OrderTab/Page_Order detail 10000704/strong_Completed'))

if (statusTwo.contains(statusOne)) {
    println('The Status of the two pages are matched')

    WebUI.closeBrowser()
} else {
    println('The Status of the two pages are not matched')

    KeywordUtil.markFailed('This test case is intentionally marked as failed.')
}

