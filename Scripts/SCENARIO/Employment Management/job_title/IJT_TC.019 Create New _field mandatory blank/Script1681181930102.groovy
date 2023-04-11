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

WebUI.callTestCase(findTestCase('internal_login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('employment_management/job_title/employment_management_sub_menu'))

WebUI.click(findTestObject('employment_management/job_title/job_title_sub_menu'))

WebUI.click(findTestObject('employment_management/job_title/create_new_button'))

String chars = '1234567890'

String code = randomString(chars, 3)

WebUI.setText(findTestObject('employment_management/job_title/job_title_name_form'), 'Automation ' + code)

WebUI.sendKeys(findTestObject('employment_management/job_title/job_title_name_form'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('employment_management/job_title/job_title_name_form'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('employment_management/job_title/job_title_code_form'), code)

WebUI.sendKeys(findTestObject('employment_management/job_title/job_title_code_form'), Keys.chord(Keys.COMMAND, 'a'))

WebUI.sendKeys(findTestObject('employment_management/job_title/job_title_code_form'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementPresent(findTestObject('employment_management/job_title/code_required'), 0)

WebUI.verifyElementPresent(findTestObject('employment_management/job_title/name_required'), 0)

WebUI.takeScreenshot()

WebUI.closeBrowser()

static String randomString(String chars, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(chars.charAt(rand.nextInt(chars.length())))
    }
    
    return sb.toString()
}

