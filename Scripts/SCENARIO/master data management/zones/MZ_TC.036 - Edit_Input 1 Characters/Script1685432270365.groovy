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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Test Cases/SCENARIO/master data management/zones/MZ_TC.022 - Create New_Input All Fields'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('Object Repository/master data management/zones/subMenu_Zones'))

WebUI.setText(findTestObject('Object Repository/master data management/zones/input_Search'), GlobalVariable.zoneName)
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/master data management/zones/btn_Edit'))

WebUI.takeFullPageScreenshot()

def randomZoneName = RandomStringUtils.randomAlphanumeric(1)

WebUI.setText(findTestObject('Object Repository/master data management/zones/input_Zone Name'), randomZoneName )

def valueZoneName = WebUI.getAttribute(findTestObject('Object Repository/master data management/zones/input_Zone Name'), 'value')

WebUI.click(findTestObject('Object Repository/master data management/zones/select_Destination'))

WebUI.click(findTestObject('Object Repository/master data management/zones/option_Destination', [('destination') : 'Bekasi']))

def randomZoneCode = RandomStringUtils.randomAlphanumeric(1)

WebUI.setText(findTestObject('Object Repository/master data management/zones/input_Zone Code'), randomZoneCode)

def valueZoneCode = WebUI.getAttribute(findTestObject('Object Repository/master data management/zones/input_Zone Code'), 'value')

WebUI.setText(findTestObject('Object Repository/master data management/zones/input_Description'), 'Test Automation')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/master data management/zones/div_SAVE'))

GlobalVariable.zoneCode = valueZoneCode
GlobalVariable.zoneName = valueZoneName

def expectedText = 'Record ' +valueZoneCode+' - '+valueZoneName+ ' has been successfully updated.'

WebUI.verifyTextPresent(expectedText, false)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/master data management/languages/button_OK'))


