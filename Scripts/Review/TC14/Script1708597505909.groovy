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

WebUI.setText(findTestObject('Object Repository/Review/input_All Categories_q'), 'test 01')

WebUI.sendKeys(findTestObject('Object Repository/Review/input_All Categories_q'), Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('Object Repository/Review/img_Rating high to low_hover-img'))
// goes to product image


WebUI.click(findTestObject('Object Repository/Review/Page_Testing Product/a_Reviews (11)'))

WebUI.scrollToPosition(0, 1600)


WebUI.scrollToPosition(0, 1400)

WebUI.click(findTestObject('Review/Page_Women Yellow Bandhani Printed Maxi Dress/textarea_Quality_comment'))

WebUI.setText(findTestObject('Object Repository/Review/Page_Retro Typewriter Keyboard, 7KEYS Elect_cd9c1b/textarea_Quality_comment'),
	'Test\n')

WebUI.scrollToPosition(0, 2200)

String path = System.getProperty("user.dir")
String modifiedPath = path.replaceAll("\\\\", "\\\\\\\\")

String pass = modifiedPath+'\\Data files\\ReviewTestImage.jpg'

WebUI.sendKeys(findTestObject('Object Repository/Review/Upload/upload'), pass)

WebUI.click(findTestObject('Object Repository/Review/Page_Retro Typewriter Keyboard, 7KEYS Elect_cd9c1b/button_Submit Review'))


//WebUI.delay(3)
WebUI.mouseOver(findTestObject('Object Repository/Review/Page_Testing Product/div_4.00 out of 5'))

WebUI.scrollToElement(findTestObject('Review/ColorTabScroll'), 0)
WebUI.scrollToPosition(0, 600)
WebUI.click(findTestObject('Object Repository/Review/Page_Testing Product/span_XL'))

WebUI.scrollToPosition(0, 1000)

WebUI.mouseOver(findTestObject('Review/Page_Testing Product/div_4.00 out of 5'))

WebUI.scrollToElement(findTestObject('Review/ColorTabScroll'), 0)

WebUI.click(findTestObject('Object Repository/Review/Page_Testing Product/span_M'))

WebUI.scrollToPosition(0, 1000)

WebUI.mouseOver(findTestObject('Review/Page_Testing Product/div_4.00 out of 5'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/img_No products in the cart_svgInject round_9519e2'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.closeBrowser()

