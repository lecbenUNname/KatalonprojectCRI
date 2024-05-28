import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('CommonTestCases/CmnLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('CartLayout/ScrlHmePage'), 1200)

WebUI.mouseOver(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/SecondProduct'))

WebUI.click(findTestObject('CartLayout/AddToCartButtonInProductPage'))

WebUI.click(findTestObject('CartLayout/Page_Crazystylezs/a_Cart'))

WebUI.scrollToPosition(0, 300)
double expprice=convertToNumber(WebUI.getText(findTestObject('Object Repository/CartLayout/CartIcon/price')))

System.out.println(expprice);
double tax=convertToNumber(WebUI.getText(findTestObject('Object Repository/CartLayout/tax')))

System.out.println(tax);


double total=convertToNumber(WebUI.getText(findTestObject('Object Repository/CartLayout/Total')))
//findTestObject('Object Repository/CartLayout/Total')
println(total)
double total1=tax+expprice
println(total1)

if(total.equals(total1))
	{
		WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
		
			WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
		
			WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
		
			WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	}
	
	else
	{
		KeywordUtil.markFailed('Total amount is calculated correctly')
	
		WebUI.click(findTestObject('CartLayout/Page_Teal Floral Printed Fit  Flare Cotton Dress/RemoveButton'))
	
		WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/img_View cart_svgInject rounded-circle'))
	
		WebUI.mouseOver(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
		WebUI.click(findTestObject('Wishlist/Page_Wishlist/a_Sign out'))
	
	   
	}
	WebUI.closeBrowser()
	
	
	
	
	
	def convertToNumber(String txt) {
		String txtOnlyNumbers = txt.replaceAll('[^0-9.]', '')
	
		txtOnlyNumbers = txtOnlyNumbers.replaceFirst('\\.', '')
	
		double txtNo = Double.parseDouble(txtOnlyNumbers)
	
		return txtNo
	}