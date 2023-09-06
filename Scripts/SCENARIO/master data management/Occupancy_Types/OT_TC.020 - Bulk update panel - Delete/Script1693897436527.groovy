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

String chars = 'abcdefghijklmnopqrstuvwxyz'

String keyword = randomString(chars, 256)

WebUI.callTestCase(findTestCase('SCENARIO/master data management/Occupancy_Types/Login-occupancy_page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('corporate_airline_fare/formSearchAirlineFareData'), 'TIA')

Thread.sleep(2000)

WebUI.click(findTestObject('master data management/attraction categories/checkbox_bulk'))

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Occupancy Types/button_REMOVE OCCUPANCY TYPES'))

Thread.sleep(2000)

WebUI.click(findTestObject('master data management/Occupancy_Types/Page_Bayu Buana - Delete/button_Cancel_delete'))

WebUI.verifyElementPresent(findTestObject('master data management/attraction categories/active_inactive_status'), 0)

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

