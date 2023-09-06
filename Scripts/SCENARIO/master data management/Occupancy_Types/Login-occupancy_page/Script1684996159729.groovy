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

WebUI.openBrowser(GlobalVariable.url_login)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Log_In/input_Email_username'), GlobalVariable.user_corporate)

WebUI.setEncryptedText(findTestObject('Object Repository/Log_In/input_Password'), GlobalVariable.pass_corporate_encrypted)

WebUI.click(findTestObject('Object Repository/Log_In/btn_sign_in'))

WebUI.click(findTestObject('corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/a_Master Data Management'))

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/a_Occupancy Type'))

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/breadcrumb'), FailureHandling.STOP_ON_FAILURE)

