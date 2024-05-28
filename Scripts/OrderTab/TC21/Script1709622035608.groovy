import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO1 = WebUI.getUrl()
if (URLTO1.contains("crazystylezs") || URLTO1.contains("myshopings"))
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

WebUI.click(findTestObject('Object Repository/OrderTab/Page_Orders/a_View'))

String URLTO = WebUI.getUrl()

if (URLTO.contains("crazystylezs") || URLTO.contains("classicculture")) 
	{
		WebUI.click(findTestObject('Object Repository/OrderTab/Page_Order detail 10000789/a_Cancel order'))
		
		WebUI.click(findTestObject('Object Repository/OrderTab/Page_Order detail 10000789/a_Cancel order'))
		
		WebUI.click(findTestObject('Object Repository/OrderTab/Page_Order detail 10000789/a_Cancel order'))
		
		WebUI.click(findTestObject('Object Repository/OrderTab/Page_Order detail 10000789/a_Cancel order'))
		
		WebUI.click(findTestObject('Object Repository/OrderTab/Page_Order detail 10000789/a_Cancel order'))
		
		WebUI.click(findTestObject('Object Repository/OrderTab/Page_Order detail 10000789/a_Cancel order'))
		
		WebUI.click(findTestObject('Object Repository/OrderTab/Page_Order detail 10000789/a_Cancel order'))
	}

//code to click on accept 
else 
	{
		WebUI.click(findTestObject('Object Repository/OrderTab/Page_Order detail 10000789/a_Cancel order'))
	}

WebUI.delay(8)

WebUI.closeBrowser()



