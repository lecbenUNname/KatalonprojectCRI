import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url)

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings")) {
	WebUI.click(findTestObject('Object Repository/commonlogin/Page_Crazystylezs/Page_Crazystylezs/button_Allow cookies'))
}



WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Crazystylezs/span_Account'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Login/AcntDrpDwnLoginButton'), 1, FailureHandling.OPTIONAL)

if(x!= true)
{
	KeywordUtil.markFailed()
}
else {
	WebUI.click(findTestObject('Object Repository/Login/AcntDrpDwnLoginButton'))
}


WebUI.setText(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'), 'rickwillson25@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Login/input_Create one_password'), 'rse3JpZZzkOX40xR4fcdlw==')

String attr = WebUI.getAttribute(findTestObject('Login/Page_Login/input_Create one_password'), 'type')
String expattr="password"

try
{
	WebUI.verifyMatch(attr, expattr, false)

WebUI.closeBrowser()
}
catch(Exception e)
{
	KeywordUtil.markFailed("PassWord field is not encrypted")
	WebUI.closeBrowser()
}

WebUI.closeBrowser()