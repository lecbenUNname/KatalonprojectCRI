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

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Wishlist/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-wish_cea609'))

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/img_Sarees_hover-img'))

WebUI.click(findTestObject('Object Repository/Login/Page_Register/Page_Login/Page_Women Yellow Bandhani Printed Maxi Dress/productimage'))

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Women Yellow Bandhani Printed Maxi Dress/a_Buy Now_action-btn hover-up js-add-to-wis_004c45'))

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Wishlist'))

WebUI.click(findTestObject('Wishlist/RemoveButton'))

//WebUI.click(findTestObject('Object Repository/Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.closeBrowser()

