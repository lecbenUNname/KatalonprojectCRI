import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs (2)/body_preloader                 position    _4f8658'))

WebUI.setText(findTestObject('Object Repository/Searchbar/SearchBar/Page_Crazystylezs (2)/input_All Categories_q'), '"!" or "?"')
WebUI.takeScreenshot()
try {
WebUI.verifyElementNotPresent(findTestObject('Searchbar/SearchBar/Searchbar_dropdown_position'), 0)
}catch(Exception e){
	KeywordUtil.markFailed("Product displayed under searchbar")
		
	}
WebUI.closeBrowser()


