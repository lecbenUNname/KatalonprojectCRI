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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.security.SecureRandom as SecureRandom
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

WebUI.callTestCase(findTestCase('Checkout/searchForProduct'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 10)

WebUI.click(findTestObject('Object Repository/Checkout/Cart_Icon'))

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Object Repository/Checkout/button_Proceed To Checkout'))
try {
WebUI.click(findTestObject('Object Repository/Checkout/Add_a_new_Address_CheckoutPage'))
}
catch(Exception E) {}

WebUI.clearText(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'))

WebUI.clearText(findTestObject('Object Repository/Checkout/Email_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/address_phone_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/State_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/City_CheckoutPage'))

WebUI.clearText(findTestObject('Object Repository/Checkout/Address_CheckoutPage'))

WebUI.setText(findTestObject('Object Repository/Checkout/FullName_Checkoutpag'), generateRandomchar(3))

WebUI.setText(findTestObject('Object Repository/Checkout/Email_CheckoutPage'), generateRandomSpc(3) + generateRandomEmail())

WebUI.setText(findTestObject('Object Repository/Checkout/address_phone_CheckoutPage'), generateRandomNo(10))

WebUI.click(findTestObject('Object Repository/Checkout/SelectCountry_CheckoutPage'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/Checkout/SelectCountry_CheckoutPage'), 'India', true)

WebUI.setText(findTestObject('Object Repository/Checkout/State_CheckoutPage'), 'Tamil Nadu')

WebUI.setText(findTestObject('Object Repository/Checkout/City_CheckoutPage'), 'Chennai')

WebUI.setText(findTestObject('Object Repository/Checkout/Address_CheckoutPage'), generateRandomchar(1) + 'no 56/34 bv nager')

boolean x = WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/ZipCodeCheckoutpage'),1, FailureHandling.OPTIONAL)

if (x != false) {
	WebUI.clearText(findTestObject('Object Repository/Checkout/ZipCodeCheckoutpage'))
	WebUI.setText(findTestObject('Object Repository/Checkout/ZipCodeCheckoutpage'),'636007')
}

WebUI.scrollToPosition(0, 450)

//To get the URL and trim the random path
String Get_URL_checkout = WebUI.getUrl()

String trimmedUrl = trimRandomPart(Get_URL_checkout)

WebUI.click(findTestObject('Object Repository/Checkout/Checkout_button_CheckoutPage'))

WebUI.delay(3)

String Get_URL_if_Checkout = WebUI.getUrl()

String trimmedUrl2 = trimRandomPart1(Get_URL_if_Checkout)

WebUI.scrollToPosition(0, 450)

if (trimmedUrl.equals(trimmedUrl2)) {
    KeywordUtil.markPassed('Checkout page URL is correct. Test passed.')
} else {
    KeywordUtil.markFailed('Checkout page URL is incorrect. Test failed.')
}

WebUI.scrollToPosition(0, 450)

WebUI.closeBrowser() // Find the index of the last occurrence of "/"
// Extract the substring up to the last "/"
// Find the index of the last occurrence of "/"
// Extract the substring up to the last "/"

String generateRandomchar(int length) {
    def characters = 'zxcvbnmasdfghjklqwertyuiop'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

String generateRandomNo(int length) {
    def characters = '1234567890'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

String generateRandomSpc(int length) {
    def characters = '!#%$%^&*_'

    def random = new SecureRandom()

    return (0..length).collect({ 
            characters[random.nextInt(characters.length())]
        }).join()
}

String generateRandomEmail() {
    def domains = ['gmail', 'outlook', 'yahoo', 'icloud', 'zoho']

    def randomDomain = domains[new Random().nextInt(domains.size())]

    def randomName = 'Test' + new Random().nextInt(10000)

    def re = ((randomName + '@') + randomDomain) + '.com'

    return re
}

String trimRandomPart(String Get_URL_checkout) {
    int lastSlashIndex = Get_URL_checkout.lastIndexOf('/')

    String trimmedUrl = Get_URL_checkout.substring(0, lastSlashIndex + 1)

    return trimmedUrl
}

String trimRandomPart1(String Get_URL_if_Checkout) {
    int lastSlashIndex = Get_URL_if_Checkout.lastIndexOf('/')

    String trimmedUrl = Get_URL_if_Checkout.substring(0, lastSlashIndex + 1)

    return trimmedUrl
}