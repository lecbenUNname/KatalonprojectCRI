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

WebUI.scrollToElement(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Traditional Wear Lehanga CholiMaxi DressSarees'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af_1'))

WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-wish_cea609'))

String i = WebUI.getText(findTestObject('Wishlist/AlertMessage2'))

println(i)

WebUI.click(findTestObject('Object Repository/Wishlist/AlertClose'))

WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/div_Hot                                    _6fe5af_1'))
WebUI.click(findTestObject('Object Repository/Wishlist/Page_Crazystylezs/a_Sarees_action-btn hover-up js-add-to-wish_cea609'))

String j = WebUI.getText(findTestObject('Wishlist/AlertMessage2'))

println(j)

if (i.contains('Added product ')) {
    if (j.contains('Removed product ')) {
        WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

        WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

        WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
    }
} else {
    KeywordUtil.markFailed('Failed due to incorrect message')

    WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

    WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

    WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))
}

WebUI.closeBrowser()

