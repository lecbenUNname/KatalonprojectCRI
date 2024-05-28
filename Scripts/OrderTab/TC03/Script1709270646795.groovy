import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings"))
	 {
	WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/AllowCookiesButton'))
}

WebUI.click(findTestObject('ChangePassword/Page_classicculture/AccountButton'))

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Login/input_Create one_email'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Login/input_Create one_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Account information/a_Product'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Products/img_Add_hover-img'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_hot wheels cars/button_Add to cart'))

WebUI.scrollToPosition(0, 50)

WebUI.mouseOver(findTestObject('Object Repository/OrderTab/Page_classicculture/a_Cart'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_hot wheels cars/a_Checkout'))

//WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/i_Select available addresses_fas fa-angle-down'))
//
//WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/i_Select available addresses_fas fa-angle-down'))
//WebUI.selectOptionByValue(findTestObject('Object Repository/OrderTab/Page_Checkout/select_Add new address.                    _664638'), 
//    'new', true)
try {
    WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/select_Add new address.                    _664638'))
}
catch (Exception e) {
} 

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressname'), 'John')

WebUI.clearText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressemail'))

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressemail'), 
    'john@gmail.com')

WebUI.clearText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressphone'))

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressphone'), 
    '8546879854')

WebUI.clearText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'))

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'), 
    'india')

//WebUI.clearText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'))
//
//WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'), 
//    'india')
//
//WebUI.doubleClick(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'))
//
//WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'))
//
//WebUI.clearText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresscity'))
//
//WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresscity'), 'india')
//
//WebUI.clearText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'))
//
//WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'), 
//    'India')
//
//WebUI.doubleClick(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'))
//
//WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'))
//
//WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresscity'), 'india')
//
//WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressstate'))
//
WebUI.clearText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresscity'))

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresscity'), 'India')

WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addressaddress'), 
    'India')

//WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresszip_code'), 
//    '8526')
boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresszip_code'), 
    1, FailureHandling.OPTIONAL)

if (x != false) {
    WebUI.clearText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresszip_code'))

    WebUI.setText(findTestObject('Object Repository/OrderTab/Page_Checkout/input_Select available addresses_addresszip_code'), 
        '636007')
}

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/label_Online Payment'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/label_Delivery -                           _4cdab4'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Checkout/button_Checkout'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_/input_Complete Your Transaction_success'))

WebUI.click(findTestObject('Object Repository/OrderTab/Page_/a_Close'))

WebUI.click(findTestObject('ChangePassword/Page_classicculture/AccountButton'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Account information/a_Orders'))

WebUI.scrollToPosition(0, 300)

//to highlight your orders heading
WebElement element = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Orders/h5_Your Orders'), 
    30)

highlightElement(element)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Orders/h5_Your Orders'), 0)

WebElement element1 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Orders/th_ID number'), 
    30)

highlightElement(element1)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Orders/th_ID number'), 0)

WebElement element2 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Orders/th_Date'), 
    30)

highlightElement(element2)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Orders/th_Date'), 0)

WebElement element3 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Orders/th_Total'), 
    30)

highlightElement(element3)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Orders/th_Total'), 0)

WebElement element4 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Orders/th_Status'), 
    30)

highlightElement(element4)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Orders/th_Status'), 0)

WebElement element5 = WebUiBuiltInKeywords.findWebElement(findTestObject('Object Repository/OrderTab/Page_Orders/th_Actions'), 
    30)

highlightElement(element5)

WebUI.verifyElementPresent(findTestObject('Object Repository/OrderTab/Page_Orders/th_Actions'), 0)

WebUI.closeBrowser()

void highlightElement(WebElement element) {
	String originalStyle = element.getAttribute('style')

	JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 2px solid red; ' + originalStyle) + '\');', element)

	WebUI.delay(1)

	js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
}

