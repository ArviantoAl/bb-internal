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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Test Cases/SCENARIO/master data management/zones/MZ_TC.022 - Create New_Input All Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('Object Repository/master data management/zones/masterLanguagesSubMenu'))

WebUI.setText(findTestObject('Object Repository/master data management/zones/input_Search'), GlobalVariable.zoneName)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/master data management/zones/btn_Delete'))

WebUI.takeFullPageScreenshot()

String gettext = WebUI.getText(findTestObject('Object Repository/master data management/languages/infoConfirmDelete'))

String [] split = gettext.split(" ");

String zoneCode = split[9]

String zoneName = split[12]

WebUI.comment(zoneName)

WebUI.click(findTestObject('Object Repository/master data management/zones/btn_Confirm Delete'))

WebUI.verifyTextPresent('Record' +	zoneCode + ' - ' + zoneCode + 'was successfully deleted.', false)

WebUI.takeFullPageScreenshot()