
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

WebUI.scrollToPosition(0, GlobalVariable.HomePageScrollToPosition)

WebUI.takeScreenshot()

WebUI.mouseOver(findTestObject('Object Repository/QuickView/ProductMouseOver'))

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewIcon'))

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewActiveProductImage'))

WebUI.mouseOver(findTestObject('Object Repository/QuickView/MouseOverOnZoomImage'))

CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/QuickView/MouseOverOnZoomImage'))

 boolean Xpresent = WebUI.verifyElementPresent(findTestObject('Object Repository/QuickView/CloseBtnQuickViewZoomImg'), 1, FailureHandling.OPTIONAL)

if(Xpresent == true) {
	WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ESCAPE))
}
else {
	KeywordUtil.markFailed('')
}

WebUI.closeBrowser()