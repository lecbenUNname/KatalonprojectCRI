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

WebUI.callTestCase(findTestCase('CommonLoginPage/Url_Launch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('ProductPageLayout/Page_Testing Product/ProductPageLayout/headerproduct'))

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Products/a_Women'))

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Products/a_Traditional Wear'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Products/a_Lehanga Choli'))

WebUI.scrollToPosition(0, 300)

WebUI.mouseOver(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Lehanga Choli/a_Embroidered Semi-Stitched Lehenga Choli W_69179c'))

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Lehanga Choli/a_Embroidered Semi-Stitched Lehenga Choli W_69179c'))

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Embroidered Semi-Stitched Lehenga Chol_20dbcb/img_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Embroidered Semi-Stitched Lehenga Chol_20dbcb/img_1_2'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Embroidered Semi-Stitched Lehenga Chol_20dbcb/img_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Embroidered Semi-Stitched Lehenga Chol_20dbcb/img_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/ProductPageLayout/Page_Testing Product/ProductPageLayout/Page_Embroidered Semi-Stitched Lehenga Chol_20dbcb/img_1'))

WebUI.closeBrowser()

