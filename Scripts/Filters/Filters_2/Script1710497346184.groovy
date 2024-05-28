import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.click(findTestObject('Filters/Click_Product/Page_Crazystylezs/a_Product'))

WebUI.verifyElementPresent(findTestObject('Filters/Click_Product/Page_Products/div_Products'), 0)

CustomKeywords.'com.helper.common.CommonMethod.highlightElement'(findTestObject('Filters/Click_Product/Page_Products/div_Products'))

WebUI.closeBrowser()

