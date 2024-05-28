import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Url)

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings")) {
	WebUI.click(findTestObject('Object Repository/commonlogin/Page_Crazystylezs/Page_Crazystylezs/button_Allow cookies'))
}



WebUI.mouseOver(findTestObject('Object Repository/Login/Page_Crazystylezs/span_Account'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Login/AcntDrpDwnLoginButton'), 1, FailureHandling.OPTIONAL)

if(x!= true)
{
	KeywordUtil.markFailed()
}
else {
	WebUI.click(findTestObject('Object Repository/Login/AcntDrpDwnLoginButton'))
}


WebUI.click(findTestObject('Login/Page_Login/input_Create one_email'))

WebUI.setText(findTestObject('Object Repository/Login/Page_Login/input_Create one_email'), '')

WebUI.click(findTestObject('Login/Page_Login/input_Create one_password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Login/input_Create one_password'), 'rse3JpZZzkOX40xR4fcdlw==')

WebUI.click(findTestObject('Object Repository/Login/Page_Login/button_Login'))

String valMsg = WebUI.getAttribute(findTestObject('Login/ValMsgEmail'), 'validationMessage')

String expMsg = 'Please fill out this field'

println(valMsg)

if (valMsg.contains(expMsg)) {
    WebUI.closeBrowser()
} else {
    KeywordUtil.markFailed('Incorrect validation message')

    WebUI.closeBrowser()
}

