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
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory
import java.awt.Robot
import java.awt.event.KeyEvent
import java.awt.Rectangle as Rectangle
import java.awt.Robot as Robot
import java.awt.Toolkit as Toolkit
import java.awt.image.BufferedImage as BufferedImage
import javax.imageio.ImageIO as ImageIO
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import java.awt.Desktop
import java.io.File
import java.io.IOException
import java.nio.file.*
import com.kms.katalon.core.configuration.RunConfiguration

RunConfiguration.setWebDriverPreferencesProperty('args', ['window-size=1920,1080'])

String filePath = RunConfiguration.getProjectDir() + '/Download/'

WebUI.comment(filePath)

String path = filePath.replace("/","\\")

WebUI.comment(path)

System.setProperty('webdriver.chrome.driver', DriverFactory.chromeDriverPath)

ChromeOptions options = new ChromeOptions();

Map<String, Object> prefs = new HashMap<String, Object>();

prefs.put("download.default_directory", path);

options.setExperimentalOption("prefs", prefs);

WebDriver driver = new ChromeDriver(options)

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl(GlobalVariable.url_login)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Log_In/input_Email_username'), GlobalVariable.user_corporate)

WebUI.setEncryptedText(findTestObject('Object Repository/Log_In/input_Password'), GlobalVariable.pass_corporate_encrypted)

WebUI.click(findTestObject('Object Repository/Log_In/btn_sign_in'))

WebUI.click(findTestObject('Object Repository/master_employee/dashboardBtn'))

WebUI.click(findTestObject('master_employee/corporateManagementBtn'))

WebUI.click(findTestObject('Object Repository/master data management/Languages/masterLanguagesSubMenu'))

WebUI.click(findTestObject('Object Repository/master data management/Languages/input_Search'))

WebUI.click(findTestObject('Object Repository/master data management/Languages/btn_Download'))

WebUI.takeFullPageScreenshot()

// get parent folder:
def dir = new File(RunConfiguration.getProjectDir() + '/Download/')

// first requirement, will continuously check folder until at least 1 file name with substring of "Pending" exists:
def foundPending = false

def files = dir.list()

for (String fileStr : files) {
    File file = new File(fileStr)

    if (file.getName().contains('languages')) {
        println(fileStr)

        GlobalVariable.file = fileStr
    }
}

String pathfile = 'Download/' + GlobalVariable.file

WebUI.comment(pathfile)

File file = new File(pathfile)

Files.deleteIfExists(Paths.get(pathfile))
	