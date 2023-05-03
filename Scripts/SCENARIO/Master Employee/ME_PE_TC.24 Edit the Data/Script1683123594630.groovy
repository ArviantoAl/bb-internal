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

WebUI.callTestCase(findTestCase('login_internal2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('master_employee/masterEmployeeSubMenu'))

WebUI.setText(findTestObject('master_employee/input_Job Title_form-control'), 'Dummy')

WebUI.click(findTestObject('master_employee/editButton'))

WebUI.setText(findTestObject('master_employee/firstNamePassport'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.setText(findTestObject('master_employee/firstNamePassport'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('master_employee/firstNamePassport'), 'Edit')

WebUI.setText(findTestObject('master_employee/middleNamePassport'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.setText(findTestObject('master_employee/middleNamePassport'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('master_employee/middleNamePassport'), 'Testing')

WebUI.setText(findTestObject('master_employee/lastNamePassport'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.setText(findTestObject('master_employee/lastNamePassport'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('master_employee/lastNamePassport'), 'Data')

WebUI.scrollToElement(findTestObject('master_employee/save'), 0)

WebUI.click(findTestObject('master_employee/save'))

WebUI.verifyElementVisible(findTestObject('master_employee/snackBar'))

WebUI.takeScreenshot()

WebUI.closeBrowser()