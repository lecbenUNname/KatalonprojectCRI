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

WebUI.closeBrowser()