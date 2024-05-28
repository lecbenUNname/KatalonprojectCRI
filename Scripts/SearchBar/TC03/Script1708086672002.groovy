import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import java.awt.Robot;
import java.awt.event.KeyEvent;

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

TestObject elementObject = new TestObject()

elementObject.addProperty('xpath', ConditionType.EQUALS, ('//select[@class=\'product-category-select\']//option[not(contains(text() ,\'Accessories\')) and contains(text() ,\'' + 
    GlobalVariable.Drpdwncat) + '\') ]')

WebUI.click(elementObject)

WebUI.setText(findTestObject('Object Repository/ForgotPassword/Page_Crazystylezs (1)/input_All Categories_q'), 'apple')
Robot robot = new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
WebUI.scrollToPosition(0, 300)
WebUI.closeBrowser()

