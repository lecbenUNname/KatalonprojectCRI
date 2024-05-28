import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings"))
	 {
	WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/AllowCookiesButton'))
}

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_classicculture/a_Product'))

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_Products/div_Show  12'))

WebUI.verifyElementPresent(findTestObject('SortAndShow/Page_Products/Dropdown_Show'), 0)

WebUI.click(findTestObject('Object Repository/SortAndShow/Page_Products/div_Show  12'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/SortAndShow/Page_Products/Dropdown_Show'), 0)) {
    println('Drop down not closed')

    WebUI.takeScreenshot()

    KeywordUtil.markFailed('')

    WebUI.closeBrowser()
} else {
    println('Drop down closed')
}

