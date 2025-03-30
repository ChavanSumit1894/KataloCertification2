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

WebUI.verifyElementPresent(findTestObject('Object Repository/TC16/Page_Movie Tickets, Plays, Sports, Events  _379d68/img_Popular Cities_bwc__sc-ttnkwg-26 izPSOY'), 
    0)

WebUI.rightClick(findTestObject('Object Repository/TC16/Page_Movie Tickets, Plays, Sports, Events  _379d68/img_Mumbai_bwc__sc-ttnkwg-26 izPSOY'))

WebUI.verifyElementText(findTestObject('Object Repository/TC16/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Delhi-NCR'), 
    'Delhi-NCR')

WebUI.verifyElementText(findTestObject('Object Repository/TC16/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Bengaluru'), 
    'Bengaluru')

WebUI.verifyElementText(findTestObject('Object Repository/TC16/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Hyderabad'), 
    'Hyderabad')

WebUI.verifyElementText(findTestObject('Object Repository/TC16/Page_Movie Tickets, Plays, Sports, Events  _379d68/span_Ahmedabad'), 
    'Ahmedabad')
WebUI.closeBrowser()
