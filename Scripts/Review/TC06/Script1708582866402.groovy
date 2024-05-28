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

//WebUI.openBrowser(GlobalVariable.Url)
//
//WebUI.maximizeWindow()
//
//WebUI.scrollToPosition(0, 1800)
//
//WebUI.click(findTestObject('Review/LastImage'))
//
//WebUI.scrollToPosition(0, 1200)
//
//WebUI.click(findTestObject('Object Repository/Review/Page_Maroon  Beige Ethnic Motifs Halter Nec_3265bd/a_Reviews (0)'))
//
//
//

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

String URLTO = WebUI.getUrl()
if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings")) {
	WebUI.click(findTestObject('Object Repository/commonlogin/Page_Crazystylezs/Page_Crazystylezs/button_Allow cookies'))
}

WebUI.scrollToPosition(0, 1800)

WebUI.mouseOver(findTestObject('Review/Page_Crazystylezs/div_Hot                                    _1e81cb'))

WebUI.click(findTestObject('Review/Page_Crazystylezs/div_Hot                                    _1e81cb'))

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('Object Repository/Review/Page_Maroon  Beige Ethnic Motifs Halter Nec_3265bd/a_Reviews (0)'))

WebUI.click(findTestObject('Object Repository/Review/Star1'))

WebUI.scrollToPosition(0, 1800)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Review/SubmitButtonInReview'))

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Review/AlertBoxAddedCart'), 1, FailureHandling.OPTIONAL)

if(x ==true )
{
	KeywordUtil.markFailed()
}

WebUI.closeBrowser()

