import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Login/button_Allow cookies'))

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_classicculture/img_svgInject rounded-circle'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_classicculture/a_Login'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_Login/p_Dont have an account Create one'), 
    0)

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Login/input_email'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Object Repository/Profiletab/Page_Login/input_password'), GlobalVariable.Password)

WebUI.scrollToPosition(0, 280)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Login/label_Remember me'))

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Login/button_Login'))

WebUI.click(findTestObject('Profiletab/Toaster message click'))

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_classicculture/img_svgInject rounded-circle_1'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_classicculture/a_My Account'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Profiletab/Page_classicculture/a_My Account'))

WebUI.click(findTestObject('Object Repository/Profiletab/Page_classicculture/a_My Account'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'), 0)

WebUI.scrollToPosition(0, 150)

WebUI.click(findTestObject('Object Repository/Profiletab/Page_Account information/a_Profile'))