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

WebUI.setText(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/field_search'), 'detailsforupdate')

WebUI.delay(1)

WebUI.mouseOver(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/icon_details'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/icon_details'))

WebUI.delay(1)

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - details/field_occ type name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - details/field_occ type code'))

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - details/field_occupancy'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

