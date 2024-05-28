import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.Common_Helper.allow_Cookies'()

WebUI.verifyElementPresent(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'), 0)

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.closeBrowser()

