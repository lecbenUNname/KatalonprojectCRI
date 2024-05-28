
package com.helper.common
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.poi.xssf.usermodel.*
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class Common_Helper {
	TestObject yourElement
	def excelFilePath = "Data Files/TestDetailss.xlsx"



	@Keyword
	def launchWebsite() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.Url)
		String URLTO = WebUI.getUrl()
		if (URLTO.contains("crazystylezs") || URLTO.contains("myshopings")) {
			WebUI.click(findTestObject('Object Repository/FillingUpUserDetail/CommonFillingUpUserDetails/Page_Crazystylezs/button_Allow cookies'))
		}
	}

	@Keyword
	def	highlightElement(TestObject yourElement) {

		WebElement element = WebUiBuiltInKeywords.findWebElement(yourElement, 30)

		String originalStyle = element.getAttribute('style')

		JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

		js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid red; ' + originalStyle) + '\');', element)

		WebUI.takeScreenshot()
		js.executeScript(('arguments[0].setAttribute(\'style\', \'border: 3px solid blue; ' + originalStyle) + '\');', element)

		WebUI.delay(1)

		js.executeScript(('arguments[0].setAttribute(\'style\', \'' + originalStyle) + '\');', element)
	}
	@Keyword
	def logIntoApplication() {

		WebUI.click(findTestObject('Object Repository/Object_CusKeys/span_Account'))

		WebUI.scrollToPosition(0, 280)

		WebUI.setText(findTestObject('Object Repository/Object_CusKeys/input_Create one_email'), GlobalVariable.UserName)

		WebUI.setText(findTestObject('Object Repository/Object_CusKeys/input_Create one_password'), GlobalVariable.Password)

		WebUI.click(findTestObject('Object Repository/Object_CusKeys/label_Remember me'))

		WebUI.click(findTestObject('Object Repository/Object_CusKeys/button_Login'))

		WebUI.click(findTestObject('Object Repository/Object_CusKeys/Login_button_Close'))

		WebUI.delay(2)
	}


	@Keyword
	def logout() {

		WebUI.scrollToPosition(0, 10)

		WebUI.mouseOver(findTestObject('Object Repository/Object_CusKeys/span_Account'))

		WebUI.click(findTestObject('Object Repository/Object_CusKeys/Sign_Out'))

		WebUI.closeBrowser()
	}


	@Keyword
	def writeOnExcel(String fullName, String username, String password) {
		try {
			// Load the Excel file
			FileInputStream fileInputStream = new FileInputStream(new File(excelFilePath))
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream)

			// Get the first sheet (assuming it's the only sheet)
			XSSFSheet sheet = workbook.getSheetAt(0)

			// Get the last row number and increment it for the new data
			int lastRowNum = sheet.getLastRowNum()
			int newRowNum = lastRowNum + 1

			// Create a new row
			XSSFRow newRow = sheet.createRow(newRowNum)

			// Write data to the row
			newRow.createCell(0).setCellValue(fullName)
			newRow.createCell(1).setCellValue(username)
			newRow.createCell(2).setCellValue(password)

			// Get the URL of the page
			String pageURL = WebUI.getUrl()

			// Write the URL to the next column (column index 3)
			newRow.createCell(3).setCellValue(pageURL)

			// Save changes to the Excel file
			FileOutputStream fileOutputStream = new FileOutputStream(new File(excelFilePath))
			workbook.write(fileOutputStream)
			fileOutputStream.close()

			// Close workbook and file input stream
			workbook.close()
			fileInputStream.close()

			// Print success message
			println("Data has been written to the Excel file.")
		} catch (Exception e) {
			// Print error message
			println("Error writing data to Excel file: " + e.getMessage())
		}
		// Example usage:
		// writeOnExcel("John Doe", "johndoe", "password123")
	}
}

