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

'Pada NEGATIVE CASE beberapa pengecekan elemen ditiadakan, hal ini diharapkan mempercepat pengecekan.'
switch (action) {
    case 'Login':
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.delay(2)

        WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/img_Email_img-fluid'), 0)

        //WebUI.verifyElementText(findTestObject('Login/Page_Bayu Buana/p_Dashboard'), 'We are, The Expert Travel Agent Partnership')
        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Welcome Back'), 'Welcome Back!')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Please Sign in to continue'), 
            'Please Sign in to continue')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Email'), 'Email')

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Email_username'), FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Email is required'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Object Repository/Page_Bayu Buana/input_Email_username'), 'hargblus@gmail.com')

        WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Email is not a valid email'), 
            0)

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Password'), 'Password')

        WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_Bayu Buana/i_Password_fa fa-eye-slash'))

        WebUI.setText(findTestObject('Object Repository/Page_Bayu Buana/input_Password_password'), '@masukl4h')

        WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Password_custom-inline-checkbox-remember'))

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Remember Me'), 'Remember Me')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Forgot Password'), 'Forgot Password?')

        WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/img_SIGN IN_bb-logo d-none d-md-block'), 
            0)

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_2021 - 2023 Bayu Buana Travel Services. A_30e6cd'), 
            '© 2021 - 2023 Bayu Buana Travel Services. All Rights Reserved.')

        WebUI.click(findTestObject('Object Repository/Login/Page_Bayu Buana/button_SIGN IN'))

        WebUI.verifyElementText(findTestObject('Login/Page_Bayu Buana/p_Dashboard'), 'Dashboard')

        WebUI.takeScreenshot()

        break
    case 'Login_Pengguna_Tidak_Aktif':
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Login Logout/Masuk/input_Email'), GlobalVariable.user_nonaktif)

        WebUI.setText(findTestObject('Login Logout/Masuk/input_Password'), GlobalVariable.pwd_2)

        WebUI.click(findTestObject('Login Logout/Masuk/button_Masuk'))

        WebUI.verifyElementVisible(findTestObject('Login Logout/Masuk/div_Terjadi Kesalahan'), FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Login Logout/Masuk/div_Gagal login, akun tidak aktif'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        break
    case 'Login_Invalid_Email':
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), 'inihanyateks')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.enhancedClick(findTestObject('Login/Page_Bayu Buana/input_Email_username'))

        WebUI.takeScreenshot()

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), '   ')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), 'email')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), 'email@mail')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), 'email@mail.')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), '@mail.com')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), 'mail.com')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), '.com')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), 'email@=naragas.com')

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_Email is not a valid email'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        break
    case 'Login_Invalid_Password':
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/img_Email_img-fluid'), 0)

        //WebUI.verifyElementText(findTestObject('Login/Page_Bayu Buana/p_Dashboard'), 'We are, The Expert Travel Agent Partnership')
        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Welcome Back'), 'Welcome Back!')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Please Sign in to continue'), 
            'Please Sign in to continue')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Email'), 'Email')

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Email_username'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Object Repository/Page_Bayu Buana/input_Email_username'), GlobalVariable.user_corporate)

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Password'), 'Password')

        WebUI.setText(findTestObject('Object Repository/Page_Bayu Buana/input_Password_password'), 'Password@s4l4h')

        WebUI.click(findTestObject('Object Repository/Login/Page_Bayu Buana/button_SIGN IN'))

        WebUI.verifyElementVisible(findTestObject('Login/Page_Bayu Buana/div_A user was not found with the given cre_adf26c'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.delay(1)

        WebUI.takeScreenshot()

        break
    case 'Login_Email_Blank':
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), '')

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Password_password'), GlobalVariable.pass_corporate)

        WebUI.click(findTestObject('Object Repository/Login/Page_Bayu Buana/button_SIGN IN'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Email is required'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        break
    case 'Login_Password_Blank':
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Login/Page_Bayu Buana/input_Email_username'), GlobalVariable.user_corporate)

        WebUI.click(findTestObject('Object Repository/Login/Page_Bayu Buana/button_SIGN IN'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Password is required'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        break
    case 'Login_Field_Blank':
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/img_Email_img-fluid'), 0)

        //WebUI.verifyElementText(findTestObject('Login/Page_Bayu Buana/p_Dashboard'), 'We are, The Expert Travel Agent Partnership')
        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Welcome Back'), 'Welcome Back!')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Please Sign in to continue'), 
            'Please Sign in to continue')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Email'), 'Email')

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Email_username'), FailureHandling.STOP_ON_FAILURE)

        WebUI.click(findTestObject('Object Repository/Login/Page_Bayu Buana/button_SIGN IN'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Password is required'), FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        break
    case 'Login_Email_Tidak _Terdaftar':
        WebUI.openBrowser('')

        WebUI.maximizeWindow()

        WebUI.navigateToUrl(GlobalVariable.url_login)

        WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/img_Email_img-fluid'), 0)

        //WebUI.verifyElementText(findTestObject('Login/Page_Bayu Buana/p_Dashboard'), 'We are, The Expert Travel Agent Partnership')
        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Welcome Back'), 'Welcome Back!')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Please Sign in to continue'), 
            'Please Sign in to continue')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Email'), 'Email')

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Email_username'), FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Email is required'), FailureHandling.STOP_ON_FAILURE)

        WebUI.setText(findTestObject('Object Repository/Page_Bayu Buana/input_Email_username'), GlobalVariable.user_corporate_not_listed)

        WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_Bayu Buana/div_Email is not a valid email'), 
            0)

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Password'), 'Password')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Password_password'), '')

        WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_Bayu Buana/i_Password_fa fa-eye-slash'))

        WebUI.setText(findTestObject('Object Repository/Page_Bayu Buana/input_Password_password'), GlobalVariable.pass_corporate)

        WebUI.verifyElementClickable(findTestObject('Object Repository/Login/Page_Bayu Buana/input_Password_custom-inline-checkbox-remember'))

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/label_Remember Me'), 'Remember Me')

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_Forgot Password'), 'Forgot Password?')

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/img_SIGN IN_bb-logo d-none d-md-block'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementText(findTestObject('Object Repository/Login/Page_Bayu Buana/p_2021 - 2023 Bayu Buana Travel Services. A_30e6cd'), 
            '© 2021 - 2023 Bayu Buana Travel Services. All Rights Reserved.')

        WebUI.click(findTestObject('Object Repository/Login/Page_Bayu Buana/button_SIGN IN'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Page_Bayu Buana/div_A user was not found with the given cre_adf26c'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.takeScreenshot()

        break
    default:
        WebUI.openBrowser(GlobalVariable.url_login)

        WebUI.maximizeWindow()

        WebUI.waitForPageLoad(5, FailureHandling.STOP_ON_FAILURE)

        WebUI.verifyElementText(findTestObject('Login Logout/Masuk/a_Gapuraprima'), 'Gapuraprima')

        WebUI.verifyElementText(findTestObject('Login Logout/Masuk/span_Masuk'), 'Masuk')

        WebUI.setText(findTestObject('Login Logout/Masuk/input_Email'), GlobalVariable.user_erp)

        WebUI.setText(findTestObject('Login Logout/Masuk/input_Password'), GlobalVariable.pwd)

        WebUI.verifyElementText(findTestObject('Login Logout/Masuk/label_Ingat Saya'), 'Ingat Saya')

        WebUI.click(findTestObject('Login Logout/Masuk/button_Masuk'))

        WebUI.verifyElementText(findTestObject('Side Menu/i_Dashboard'), 'Dashboard')

        WebUI.takeScreenshot()}

