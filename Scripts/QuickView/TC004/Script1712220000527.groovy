import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.AWTException
import java.awt.Robot
import java.awt.event.KeyEvent

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

WebUI.click(findTestObject('Object Repository/QuickView/CloseBtnQuickViewZoomImg'))

WebUI.closeBrowser()