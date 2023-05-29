import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
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
import internal.GlobalVariable

import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase('Test Cases/login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('Object Repository/master data management/Languages/masterLanguagesSubMenu'))

WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_Create New'))

WebUI.takeFullPageScreenshot()

def language_name = RandomStringUtils.randomAlphanumeric(10)
def language_native_name = RandomStringUtils.randomAlphanumeric(15)
def language_code = RandomStringUtils.randomAlphanumeric(2)
def language_alpha_3_cod = RandomStringUtils.randomAlphanumeric(3)
def language_name_fr = RandomStringUtils.randomAlphanumeric(20)
def language_native_name_fr = RandomStringUtils.randomAlphanumeric(30)


String[][] detailLanguage = [['Language Name_language_name', language_name],
						   ['Language Native Name_language_native_name', language_native_name], 
						   ['Language Code_language_code', language_code], 
						   ['Language Alpha 3 Code_language_alpha_3_code', language_alpha_3_cod],
						   ['Language Name_language_name_fr', language_name_fr],
						   ['Language Native Name_language_native_name_fr', language_native_name_fr]]

for (int input = 0; input < detailLanguage.length; input++) {

    WebUI.setText(findTestObject('Object Repository/master data management/Languages/input_' + ((detailLanguage[input])[0])), (detailLanguage[input])[1])

}

def projectDir = RunConfiguration.getProjectDir()

def filePath = projectDir + '/Images/language.png'


WebUI.uploadFile(findTestObject('Object Repository/master data management/Languages/uploadFile'), filePath)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/master data management/Languages/div_SAVE'), 0)

WebUI.click(findTestObject('Object Repository/master data management/Languages/div_SAVE'))

def getTextNotif = WebUI.getText(findTestObject('Object Repository/master data management/Languages/notif_sukses'))

assert getTextNotif.contains('has been successfully saved.')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/master data management/Languages/button_OK'))

WebUI.setText(findTestObject('Object Repository/master data management/Languages/input_Search'), language_name)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

