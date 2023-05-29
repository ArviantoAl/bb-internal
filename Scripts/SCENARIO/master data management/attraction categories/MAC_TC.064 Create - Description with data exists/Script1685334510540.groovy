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

String keyword = randomString(chars, 3)

WebUI.callTestCase(findTestCase('login_internal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/corporate_airline_fare/dashboardBtn'))

WebUI.click(findTestObject('master data management/attraction categories/master_data_sbmenu'))

WebUI.click(findTestObject('master data management/attraction categories/attraction_category_sbmenu'))

WebUI.click(findTestObject('master data management/attraction categories/breadcrumb_dashboard'))

WebUI.click(findTestObject('master_employee/create_new_button'))

WebUI.setText(findTestObject('master data management/attraction categories/form_name'),'Test Automation description' +keyword)

WebUI.setText(findTestObject('master data management/attraction categories/form_description'), 'Description Data Exist')

//WebUI.click(findTestObject('master data management/attraction categories/upload_foto'))

File document = new File('Images/dummy_photo.jpg')

String location = document.getAbsolutePath()

WebUI.uploadFile(findTestObject('master data management/attraction categories/upload_foto'), location)

Thread.sleep(3000)

WebUI.click(findTestObject('employment_management/job_title/SAVE_button'))

WebUI.verifyElementPresent(findTestObject('master data management/attraction categories/success_create'), 0)

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

