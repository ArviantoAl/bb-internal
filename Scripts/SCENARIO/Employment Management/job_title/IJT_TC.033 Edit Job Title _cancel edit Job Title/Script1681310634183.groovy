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

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('employment_management/job_title/employment_management_sub_menu'))

WebUI.click(findTestObject('employment_management/job_title/job_title_sub_menu'))

WebUI.click(findTestObject('employment_management/job_title/create_new_button'))

WebUI.setText(findTestObject('employment_management/job_title/job_title_name_form'), 'Name: Automation for cancel edit')

WebUI.setText(findTestObject('employment_management/job_title/job_title_code_form'), 'Code: Automation for cancel edit ')

WebUI.click(findTestObject('employment_management/job_title/SAVE_button'))

WebUI.verifyElementPresent(findTestObject('employment_management/job_title/success_message_created'), 0)

WebUI.delay(3)

WebUI.setText(findTestObject('job_title/formSearchJobTitle'), 'Automation for cancel edit')

Thread.sleep(2000)

WebUI.click(findTestObject('employment_management/job_title/edit_button'))

WebUI.click(findTestObject('employment_management/job_title/CANCEL_button'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.closeBrowser()

