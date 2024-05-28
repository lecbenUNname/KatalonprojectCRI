import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

WebUI.scrollToPosition(0, GlobalVariable.HomePageScrollToPosition)

WebUI.takeScreenshot()

WebUI.mouseOver(findTestObject('Object Repository/QuickView/ProductMouseOver'))

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewIcon'))

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewActiveProductImage'))

WebUI.mouseOver(findTestObject('Object Repository/QuickView/MouseOverOnZoomImage'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/QuickView/MouseOverOnZoomImage'))

title1 = WebUI.getAttribute(findTestObject('Object Repository/QuickView/CloseBtnQuickViewZoomImg'), 'title')

String title2 = 'Close (Esc)'

println(title1)

if (title1.contains(title2)) {
   System.out.println('Tooltip titles are same')
} else {
   System.out.println('Tooltip titles are not same')

   KeywordUtil.markFailed('This test case is intentionally marked as failed.')
}

WebUI.closeBrowser()