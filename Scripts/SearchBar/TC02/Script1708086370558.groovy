import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ForgotPassword/Page_Crazystylezs (1)/input_All Categories_q'), 'apple')
Robot robot = new Robot();	
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
WebUI.delay(3)
WebUI.scrollToElement(findTestObject('Object Repository/Searchbar/SearchBar/Page_Search result for apple (1)/img_Add_hover-img'), 0)
WebUI.closeBrowser()



