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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebElement



WebUI.callTestCase(findTestCase('Test Cases/SCENARIO/master data management/zones/MZ_TC.022 - Create New_Input All Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/SCENARIO/master data management/zones/MZ_TC.022 - Create New_Input All Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('Object Repository/master data management/zones/subMenu_Zones'))

WebUI.mouseOver(findTestObject('Object Repository/master data management/zones/pagination_next'))

classValue = WebUI.getAttribute(findTestObject('Object Repository/master data management/zones/pagination_next'), 'class')

while (!classValue.contains('disable')) {
	
	WebUI.click(findTestObject('Object Repository/master data management/zones/pagination_next'))
	
	classValue = WebUI.getAttribute(findTestObject('Object Repository/master data management/zones/pagination_next'), 'class')
}

WebUI.takeFullPageScreenshot()

// Ambil driver WebDriver dari Katalon Studio
def driver = DriverFactory.getWebDriver()

// Temukan elemen tbody yang berisi elemen-elemen <tr> dalam tabel
WebElement tbody = driver.findElement(By.tagName("tbody"))

// Temukan semua elemen <tr> dalam tbody berdasarkan tag name
List<WebElement> rows = tbody.findElements(By.tagName("tr"))

// Inisialisasi variabel untuk menyimpan ID terakhir
String lastRowId = ""

// Iterasi melalui setiap elemen <tr> dan perbarui variabel lastRowId
for (WebElement row : rows) {
    String rowId = row.getAttribute("id")
    lastRowId = rowId
}
WebUI.comment(lastRowId)

String [] numberRow = lastRowId.split("-");

WebUI.comment(numberRow[1])

int nextCB = Integer.parseInt(numberRow[1]) + 1


checkbox1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//tr["+numberRow[1]+"]//input[@class='float-left select-checkbox-item ml-2 mr-1']")

checkbox2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//tr["+nextCB+"]//input[@class='float-left select-checkbox-item ml-2 mr-1']")

WebUI.click(checkbox1)

WebUI.click(checkbox2)

WebUI.click(findTestObject('Object Repository/master data management/zones/btn_Remove Zones'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/master data management/zones/btn_Confirm Delete'))

WebUI.verifyTextPresent('Records was successfully deleted.', false)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/master data management/zones/button_OK'))