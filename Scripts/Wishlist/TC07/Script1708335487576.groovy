import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

/*
 * WebUI.scrollToPosition(0, 1200)
 * 
 * WebUI.mouseOver(findTestObject('Page_Crazystylezs/div_Hot _6fe5af'))
 * 
 * WebUI.click(findTestObject('Object
 * Repository/Page_Crazystylezs/a_Sarees_action-btn hover-up
 * js-add-to-comp_9a45bb'))
 * 
 * WebUI.click(findTestObject('Compare Functionality/CompareHighlight/Close the
 * toaster'), FailureHandling.OPTIONAL)
 * 
 * WebUI.scrollToPosition(0, 50)
 */

WebUI.click(findTestObject('Object Repository/Wishlist/WishlistButton'))

// Verify the compare count in the compare icon
TestObject compareCountObject = findTestObject('Object Repository/Wishlist/wshlstcount')

if (WebUI.verifyElementPresent(compareCountObject, 10)) {
    String compareCount = WebUI.getText(compareCountObject)
	
println(compareCount)
try
    {
		boolean x = WebUI.verifyElementPresent( findTestObject('Object Repository/Wishlist/NoItemText'),10,FailureHandling.OPTIONAL)
		if(x ==true )
		{
			String compareCount1= WebUI.getText(findTestObject('Object Repository/Wishlist/NoItemText'))
	println(compareCount1)
	
	if (compareCount.equals("0") && compareCount1.contains("No item in wishlist"))
		 {     println("Wishlist count and wishlist page text match: No item in wishlist")
			 
	
		 }
	else
		{     println("Wishlist count and wishlist page text do not match")
			
		}
}
    }
catch(Exception e)
{
	while (compareCount > 0) {
		WebUI.click(findTestObject('Wishlist/Page_Wishlist/i_In stock_fi-rs-trash'))
		WebUI.refresh()
		
	
}
//	if(compareCount.equals(compareCount1))
//	{
//	println("Text is correctly displayed")
//	}
//	else
//	{
//		println("Incorrect text")
//	}
}
}
WebUI.mouseOver(findTestObject('Object Repository/Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))

WebUI.mouseOver(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.click(findTestObject('Login/Page_Crazystylezs/a_Sign out'))

WebUI.closeBrowser()


