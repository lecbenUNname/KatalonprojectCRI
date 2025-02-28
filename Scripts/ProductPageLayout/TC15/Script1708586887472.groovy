import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('ProductPageLayout/Common_PPL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ProductPageLayout/Testing_product'))

WebUI.click(findTestObject('ProductPageLayout/Testing_product'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Testing_Product_Secondary'))

WebUI.delay(3)

try {
    // Create an instance of the Robot class
    Robot robot = new Robot()

    // Simulate pressing and releasing the left arrow key
    robot.keyPress(KeyEvent.VK_LEFT)

    robot.keyRelease(KeyEvent.VK_LEFT)

    WebUI.delay(3)

    robot.keyPress(KeyEvent.VK_RIGHT)

    robot.keyRelease(KeyEvent.VK_RIGHT)
}
catch (Exception e) {
    e.printStackTrace()
} 

WebUI.closeBrowser()

