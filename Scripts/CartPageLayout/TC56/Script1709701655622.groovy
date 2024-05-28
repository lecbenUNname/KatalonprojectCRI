import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1000)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.mouseOver(findTestObject('CartLayout/EyeIcon2'))

WebUI.click(findTestObject('CartLayout/EyeIcon2'))

WebUI.scrollToElement(findTestObject('CartLayout/EyeAddToCart'), 1000)

WebUI.click(findTestObject('CartLayout/AddToCartEye'))

WebUI.click(findTestObject('CartLayout/CloseBtn'))

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.mouseOver(findTestObject('CartLayout/EyeIcon2'))

WebUI.click(findTestObject('CartLayout/EyeIcon2'))

WebUI.click(findTestObject('CartLayout/AddToCartEye'))

WebUI.click(findTestObject('CartLayout/CloseBtn'))

alertText = WebUI.getText(findTestObject('CartLayout/Alert_ProductAlreadyExist'))

String actualText = 'This product is already exists!'

// yellow dress
// Check if alertProductName is not null before performing operations on it
// Perform the comparison
if (alertText.contains(actualText)) {
    println('Aprropriate Alert message')
} else {
    println('InAprropriate Alert message')

    KeywordUtil.markFailed('Inappropriate alert message.')
}

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))

      WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))

    WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
WebUI.closeBrowser()

