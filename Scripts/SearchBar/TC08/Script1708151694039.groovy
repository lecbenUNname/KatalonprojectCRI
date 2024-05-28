import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs (1)/input_All Categories_q'))
WebUI.setText(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs (1)/input_All Categories_q'), 'apple')
WebUI.delay(3)
DriverFactory.getWebDriver().navigate().back()
WebUI.delay(3)
DriverFactory.getWebDriver().navigate().forward()
WebUI.closeBrowser()


