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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyElementClickable(findTestObject('Object Repository/TC006/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/TC006/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.rightClick(findTestObject('Object Repository/TC006/Page_CURA Healthcare Service/h2_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC006/Page_CURA Healthcare Service/p_Please login to make appointment'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/TC006/Page_CURA Healthcare Service/input_Demo account_form-control'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/TC006/Page_CURA Healthcare Service/label_Demo account'), 'Demo account')

WebUI.verifyElementPresent(findTestObject('Object Repository/TC006/Page_CURA Healthcare Service/label_Username'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/TC006/Page_CURA Healthcare Service/label_Password'), 0)

WebUI.closeBrowser()