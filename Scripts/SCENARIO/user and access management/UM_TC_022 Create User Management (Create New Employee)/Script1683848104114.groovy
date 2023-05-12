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

WebUI.click(findTestObject('user_management/user_access_sbm'))

Thread.sleep(2000)

WebUI.click(findTestObject('user_management/user_management_sbm'))

WebUI.click(findTestObject('user_management/breadcrumb_board'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('master_employee/create_new_button'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('user_management/create_new_employee'), FailureHandling.STOP_ON_FAILURE)

String chars = 'QWERTYUIOPASDFGHJKLZXCVBNM'

String code = randomString(chars, 4)

WebUI.setText(findTestObject('master_employee/formName'), 'Testing')

//WebUI.click(findTestObject('master_employee/chooseIndonesia'))
WebUI.setText(findTestObject('master_employee/middleName'), 'Script')

WebUI.setText(findTestObject('master_employee/lastName'), code)

WebUI.click(findTestObject('master_employee/inputDayBirth'))

WebUI.setText(findTestObject('master_employee/inputDayBirth'), '1')

WebUI.click(findTestObject('master_employee/chooseDay10'))

WebUI.click(findTestObject('master_employee/inputMonthBirth'))

WebUI.setText(findTestObject('master_employee/inputMonthBirth'), 'Feb')

WebUI.click(findTestObject('master_employee/chooseFebruary'))

WebUI.click(findTestObject('master_employee/chooseYear'))

WebUI.setText(findTestObject('master_employee/chooseYear'), '199')

WebUI.click(findTestObject('master_employee/choose_1999'))

WebUI.setText(findTestObject('master_employee/idCard'), '1111111111')

WebUI.scrollToElement(findTestObject('master_employee/homePhone'), 0)

WebUI.setText(findTestObject('master_employee/homePhone'), '21221221')

WebUI.setText(findTestObject('master_employee/phoneNumber'), '88888888')

WebUI.setText(findTestObject('master_employee/inputEmail'), code + '@mailo.com')

WebUI.setText(findTestObject('master_employee/address'), 'Testing Alamat Automation')

WebUI.click(findTestObject('user_management/arrow_nationaly'))

WebUI.setText(findTestObject('user_management/input_nationaly'), 'Indonesia')

//WebUI.click(findTestObject('user_management/same_address_checklist'))
//WebUI.click(findTestObject('master_employee/country'))
//
//WebUI.setText(findTestObject('master_employee/country'), 'indo')
WebUI.click(findTestObject('master_employee/chooseIndonesia'))

WebUI.click(findTestObject('user_management/arrow_province'))

WebUI.setText(findTestObject('user_management/input_province'), 'Bal')

WebUI.click(findTestObject('master_employee/Bali'))

//WebUI.click(findTestObject('user_management/arrow_city'))
//
//WebUI.setText(findTestObject('user_management/input_city'), 'Denpa')
//
//WebUI.click(findTestObject('master_employee/denpasar'))
WebUI.click(findTestObject('master_employee/sameAddress'))

WebUI.click(findTestObject('master_employee/saveNext'))

Thread.sleep(2000)

WebUI.click(findTestObject('master_employee/saveNext'))

String numb = '1234567890'

String inputNumb = randomStringA(numb, 5)

WebUI.setText(findTestObject('master_employee/employeeID'), inputNumb)

Thread.sleep(2000)

WebUI.click(findTestObject('user_management/input_jt'))

WebUI.setText(findTestObject('user_management/input_jt'), 'Script Automation')

WebUI.click(findTestObject('user_management/script_automation_jt'))

WebUI.click(findTestObject('user_management/branch_office'))

WebUI.click(findTestObject('user_management/bintaro'))

WebUI.click(findTestObject('user_management/hiring_day'))

WebUI.setText(findTestObject('user_management/hiring_day'), '15')

WebUI.sendKeys(findTestObject('user_management/hiring_day'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('user_management/hiring_month'))

WebUI.setText(findTestObject('user_management/hiring_month'), 'Feb')

WebUI.sendKeys(findTestObject('user_management/hiring_month'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('user_management/hiring_year'))

WebUI.setText(findTestObject('user_management/hiring_year'), '2021')

WebUI.sendKeys(findTestObject('user_management/hiring_year'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('master_employee/npwp'), '11111111111111111')

WebUI.click(findTestObject('special_dates/btn_save'))

WebUI.verifyElementPresent(findTestObject('user_management/header_create'), 0)

Thread.sleep(2000)

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

static String randomStringA(String numb, int length) {
    Random rand = new Random()

    StringBuilder sb = new StringBuilder()

    for (int i = 0; i < length; i++) {
        sb.append(numb.charAt(rand.nextInt(numb.length())))
    }
    
    return sb.toString()
}

