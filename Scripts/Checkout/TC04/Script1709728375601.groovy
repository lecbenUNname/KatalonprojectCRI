import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



//This steps will attempt until the stock product is available

CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

WebUI.scrollToPosition(0, 1480)

WebUI.delay(2)

int i = 1
boolean x = false
while (x == false) {
    TestObject Obj = new TestObject()

    Obj.addProperty('xpath', ConditionType.EQUALS, ('(//img[@class=\'default-img\'])[' + i) + ']')

    WebUI.mouseOver(Obj)

    Obj.addProperty('xpath', ConditionType.EQUALS, ('(//span[text() =\'Add\'])[' + i) + ']')

    WebUI.click(Obj)

    i++

    boolean y = WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/Danger_Alert'), 1, FailureHandling.OPTIONAL)
	
	if(y == true)
	{	CustomKeywords.'com.helper.common.Common_Helper.highlightElement'(findTestObject('Object Repository/Checkout/Danger_Alert'))
	
    WebUI.click(findTestObject('Object Repository/Checkout/Toaster_CloseBtn'))
	x = true
	}
	
	else {
		WebUI.takeScreenshot()
		KeywordUtil.markFailed()
	}
}

WebUI.closeBrowser()




