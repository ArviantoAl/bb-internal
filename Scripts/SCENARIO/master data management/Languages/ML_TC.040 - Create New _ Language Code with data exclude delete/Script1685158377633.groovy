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

WebUI.callTestCase(findTestCase('Test Cases/login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('Object Repository/master data management/Languages/masterLanguagesSubMenu'))

//get data value from view details
WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_View'))
WebUI.verifyTextPresent('Language Details', false)
GlobalVariable.languageCode = WebUI.getAttribute(findTestObject('Object Repository/master data management/Languages/input_Language Code_language_code'), 'value')
GlobalVariable.language3AlphaCode = WebUI.getAttribute(findTestObject('Object Repository/master data management/Languages/input_Language Alpha 3 Code_language_alpha_3_code'), 'value')
GlobalVariable.languageName = WebUI.getAttribute(findTestObject('Object Repository/master data management/Languages/input_Language Name_language_name'), 'value')
GlobalVariable.languageNativeName = WebUI.getAttribute(findTestObject('Object Repository/master data management/Languages/input_Language Native Name_language_native_name'), 'value')
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_Back'))

//delete the intended data form view details
WebUI.setText(findTestObject('Object Repository/master data management/Languages/input_Search'), GlobalVariable.languageName)
WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_Delete'))
WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_Confirm Delete'))
WebUI.verifyTextPresent('was successfully deleted.', false)
WebUI.takeFullPageScreenshot()
WebUI.click(findTestObject('Object Repository/master data management/Languages/button_OK'))
WebUI.setText(findTestObject('Object Repository/master data management/Languages/input_Search'), GlobalVariable.languageName)
WebUI.verifyTextPresent('No languages found', false)
WebUI.takeFullPageScreenshot()

//create new language with same data has been deleted before
WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_Create New'))
WebUI.takeFullPageScreenshot()

String[][] detailLanguage = [['Language Name_language_name', GlobalVariable.languageName],
						   ['Language Native Name_language_native_name', GlobalVariable.languageNativeName],
						   ['Language Code_language_code', GlobalVariable.languageCode],
						   ['Language Alpha 3 Code_language_alpha_3_code', GlobalVariable.language3AlphaCode]]

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
WebUI.setText(findTestObject('Object Repository/master data management/Languages/input_Search'), GlobalVariable.languageName)
WebUI.delay(2)
WebUI.takeFullPageScreenshot()



