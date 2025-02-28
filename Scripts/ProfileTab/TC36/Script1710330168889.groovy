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

WebUI.callTestCase(findTestCase('ProfileTab/Profile Tab common'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'), 0)

WebUI.scrollToPosition(0, 150)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/Account_header_ProfilePage'))

for (int i = 0; i < 5; i++) {
    WebUI.sendKeys(null, Keys.chord(Keys.TAB))

    if (i == 2) {
        WebUI.click(findTestObject('Object Repository/Profiletab/Page_Profile/EmailLabel_profilepage'))
    }
    
    if (i == 4) {
        WebUI.sendKeys(findTestObject('Object Repository/Profiletab/Page_Profile/button_Update'), Keys.chord(Keys.ENTER))
    }      
}

WebUI.delay(3)

WebUI.closeBrowser()
