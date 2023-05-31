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

WebUI.callTestCase(findTestCase('Test Cases/login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('Object Repository/master data management/languages/masterLanguagesSubMenu'))

WebUI.click(findTestObject('Object Repository/master data management/languages/btn_Edit'))

WebUI.sendKeys(findTestObject('master data management/languages/input_Language Name_language_name'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/master data management/languages/input_Language Native Name_language_native_name'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/master data management/languages/input_Language Code_language_code'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/master data management/languages/input_Language Alpha 3 Code_language_alpha_3_code'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/master data management/languages/input_Language Name_language_name_fr'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Object Repository/master data management/languages/input_Language Native Name_language_native_name_fr'), Keys.chord(Keys.TAB))

WebUI.takeFullPageScreenshot()
