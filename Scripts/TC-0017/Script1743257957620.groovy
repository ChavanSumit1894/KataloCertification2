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

WebUI.navigateToUrl('https://in.bookmyshow.com/')

WebUI.verifyElementText(findTestObject('Object Repository/TC17/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Chandigarh'), 
    'Chandigarh')

WebUI.verifyElementText(findTestObject('Object Repository/TC17/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Chennai'), 
    'Chennai')

WebUI.verifyElementText(findTestObject('Object Repository/TC17/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Pune'), 
    'Pune')

WebUI.verifyElementText(findTestObject('Object Repository/TC17/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Kolkata'), 
    'Kolkata')

WebUI.verifyElementText(findTestObject('Object Repository/TC17/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Kochi'), 
    'Kochi')

WebUI.verifyElementPresent(findTestObject('Object Repository/TC17/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Popular Cities'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/TC17/Page_Movie Tickets, Plays, Sports, Events  _379d68/div_Detect my location'), 
    'Detect my location')

WebUI.closeBrowser()