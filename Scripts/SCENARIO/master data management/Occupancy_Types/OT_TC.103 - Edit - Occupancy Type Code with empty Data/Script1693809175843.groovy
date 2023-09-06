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

WebUI.callTestCase(findTestCase('SCENARIO/master data management/Occupancy_Types/Login-occupancy_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/icon_edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/field_search'), 'updateforcode')

WebUI.delay(1)

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/icon_edit'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Edit Occupancy Type/Edit_field occ type code'), 
    Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.delay(1)

WebUI.setText(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Edit Occupancy Type/Edit_field occ type name'), 
    'updateforcodeempty')

WebUI.delay(2)

WebUI.setText(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Edit Occupancy Type/Edit_field Occupancy'), 
    '5757')

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Create Occupancy Type/save_create'))

WebUI.verifyElementPresent(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Edit Occupancy Type/Edit_alert_Occupancy Type Code is required'), 
    0)

WebUI.delay(1)

WebUI.takeScreenshot()

