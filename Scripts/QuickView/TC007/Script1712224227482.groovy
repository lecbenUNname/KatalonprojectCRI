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


int x = numAfterOf(findTestObject('Object Repository/QuickView/ImgOfImgS'))
////
for (int i = 1; i < x; i++) {
    int k = numBeforeOf(findTestObject('Object Repository/QuickView/ImgOfImgS'))

    println(i + k)

    if (i == k) {
        WebUI.click(findTestObject('Object Repository/QuickView/ZoomImgrightArrow'))
    } else {
        KeywordUtil.markFailed('')
    }
}

WebUI.click(findTestObject('Object Repository/QuickView/CloseBtnQuickViewZoomImg'))

WebUI.closeBrowser()

def	numAfterOf(TestObject yourElement) {
	
	String fullText = WebUI.getText(yourElement);
	
	// Extracting the number after "of"
	String numberString = fullText.substring((fullText.indexOf("of ") + 3))
	
	// Converting the extracted string to an integer
	int number = Integer.parseInt(numberString)
	
	// Printing the number
	return number	
			}
			
			
def	numBeforeOf(TestObject yourElement) {
	
	String EleText = WebUI.getText(yourElement)
	String numberString = EleText.substring(0, EleText.indexOf(" of"))
	int number = Integer.parseInt(numberString)
	
	return(number)
	
			}