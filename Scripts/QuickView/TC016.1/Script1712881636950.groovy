import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

WebUI.setText(findTestObject('Object Repository/QuickView/input_All Categories_q'), GlobalVariable.QVimgSrch)

WebUI.sendKeys(findTestObject('Object Repository/QuickView/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 400)

///

WebUI.mouseOver(findTestObject('Object Repository/QuickView/ProductMouseOver')  )

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewIcon')  )

WebUI.mouseOver(findTestObject('Object Repository/QuickView/ActiveModalThumbImg'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/QuickView/ModalImgLeftArrow'), 1, FailureHandling.OPTIONAL)

boolean y = WebUI.verifyElementPresent(findTestObject('Object Repository/QuickView/ModalImgRightArrow'), 1, FailureHandling.OPTIONAL)

boolean j = x && y
println(j)
if(!j ) {
	WebUI.takeScreenshot()
	KeywordUtil.markFailed()
}

WebUI.closeBrowser()

