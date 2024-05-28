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

CustomKeywords.'com.helper.common.CommonMethod.allow_Cookies'()

WebUI.scrollToPosition(0, 1200)

WebUI.doubleClick(findTestObject('Compare Functionality/Page_Crazystylezs (1)/div_Hot                                    _6fe5af'))

WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Women Yellow Bandhani Printed Maxi Dress/a_Buy Now_action-btn hover-up js-add-to-com_e11c36'))

WebUI.click(findTestObject('Object Repository/Compare Functionality/Page_Women Yellow Bandhani Printed Maxi Dress/img_All Categories_svgInject'))

WebUI.verifyElementPresent(findTestObject('Compare Functionality/Page_Compare (1)/img'), 2)

WebUI.closeBrowser()

