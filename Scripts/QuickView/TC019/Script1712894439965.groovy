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

//boolean x = WebUI.verifyElementClickable(findTestObject('Object Repository/QuickView/ModalImgLeftArrow'),  FailureHandling.OPTIONAL)
//
//boolean y = WebUI.verifyElementClickable(findTestObject('Object Repository/QuickView/ModalImgRightArrow'),  FailureHandling.OPTIONAL)
//
//boolean j = x && y

WebUI.click(findTestObject('Object Repository/QuickView/QuickViewActiveProductImage'))

String forCount  = WebUI.getText(findTestObject('Object Repository/QuickView/ImgOfImgS'))

WebUI.click(findTestObject('Object Repository/QuickView/CloseBtnQuickViewZoomImg'))

String prefix = '1 of '

String trmDNum = forCount.replace(prefix, '')

int number =  trmDNum.toInteger()

String imgLnkChk = WebUI.getAttribute(findTestObject('Object Repository/QuickView/QuickViewActiveProductImage'),'src')


//String AddedNum = number+2


for (int i = -1 ; i<=number ; i++)
{
	WebUI.click(findTestObject('Object Repository/QuickView/ModalImgRightArrow'))
	
	println(i)
}

String imgLnkReChk = WebUI.getAttribute(findTestObject('Object Repository/QuickView/QuickViewActiveProductImage'),'src')


boolean j = WebUI.verifyMatch(imgLnkChk, imgLnkReChk, false, FailureHandling.OPTIONAL)

if(j) {
	
		KeywordUtil.markFailed()
	}

WebUI.closeBrowser()