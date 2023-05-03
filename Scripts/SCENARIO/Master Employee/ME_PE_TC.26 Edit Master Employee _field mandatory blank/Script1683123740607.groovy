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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('login_internal2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('master_employee/masterEmployeeSubMenu'))

WebUI.setText(findTestObject('master_employee/input_Job Title_form-control'), 'Dummy')

WebUI.click(findTestObject('master_employee/editButton'))

WebUI.scrollToElement(findTestObject('master_employee/inputEmail'), 0)

WebUI.sendKeys(findTestObject('master_employee/inputEmail'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('master_employee/inputEmail'), Keys.chord(Keys.BACK_SPACE))

WebUI.click(findTestObject('master_employee/othersEmail'))

WebUI.verifyElementVisible(findTestObject('master_employee/alertErrorEmail'))

WebUI.takeScreenshot()

WebUI.closeBrowser()