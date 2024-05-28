import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings")) {
	WebUI.click(findTestObject('Object Repository/commonlogin/Page_Crazystylezs/Page_Crazystylezs/button_Allow cookies'))
}

WebUI.scrollToPosition(0, 1800)

WebUI.mouseOver(findTestObject('Review/Page_Crazystylezs/div_Hot                                    _1e81cb'))

WebUI.click(findTestObject('Review/Page_Crazystylezs/div_Hot                                    _1e81cb'))

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('Object Repository/Review/Page_Maroon  Beige Ethnic Motifs Halter Nec_3265bd/a_Reviews (0)'))

WebUI.scrollToElement(findTestObject('Review/Scrl'), 2400)
try
{

//WebUI.verifyElementPresent(findTestObject('Review/LoginBtnReview'), 0)

WebUI.click(findTestObject('Review/LoginBtnReview'))

WebUI.verifyElementPresent(findTestObject('Review/LoginHeading'), 0)

}
catch(Exception e)
{
	KeywordUtil.markFailed("Login page is not opened")
	
	
	
}
WebUI.closeBrowser()

