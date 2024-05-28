import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

//This steps will attempt until the stock product is available
CustomKeywords.'com.helper.common.Common_Helper.launchWebsite'()

CustomKeywords.'com.helper.common.Common_Helper.logIntoApplication'()

WebUI.scrollToPosition(0, GlobalVariable.CheckoutHomePageScrollToPos)

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

    boolean y = WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/SuccessAlert'), 1, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/Checkout/Toaster_CloseBtn'))

    if (y == true) {
        x = true
    }
}

