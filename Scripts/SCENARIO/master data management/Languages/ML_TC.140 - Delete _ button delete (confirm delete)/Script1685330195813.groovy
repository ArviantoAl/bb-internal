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

WebUI.callTestCase(findTestCase('Test Cases/login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('Object Repository/master data management/Languages/masterLanguagesSubMenu'))

WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_Delete'))

WebUI.takeFullPageScreenshot()

String gettext = WebUI.getText(findTestObject('Object Repository/master data management/Languages/infoConfirmDelete'))

String [] split = gettext.split(" ");

String languageName = split[12]

WebUI.comment(languageName)

WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_Confirm Delete'))

WebUI.verifyTextPresent('was successfully deleted.', false)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/master data management/Languages/button_OK'))

WebUI.setText(findTestObject('Object Repository/master data management/Languages/input_Search'), languageName)

WebUI.verifyTextPresent('No languages found', false)

WebUI.takeFullPageScreenshot()