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

WebUI.openBrowser('https://services.smartbear.com/samples/TestComplete15/smartstore/login?returnUrl=%2Fsamples%2FTestComplete15%2Fsmartstore%2F')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Register/btn_register'))

WebUI.check(findTestObject('Register/gender'))

WebUI.setText(findTestObject('Register/name'), 'nan')

WebUI.setText(findTestObject('Register/LastName'), 'Anjani')

WebUI.selectOptionByValue(findTestObject('Register/date_day'), '15', true)

WebUI.selectOptionByValue(findTestObject('Register/date_m'), '12', true)

WebUI.selectOptionByValue(findTestObject('Register/date_y'), '2001', true)

WebUI.setText(findTestObject('Register/email'), 'ih@te.com')

WebUI.setText(findTestObject('Register/username'), 'hehehe')

WebUI.setText(findTestObject('Register/pass'), 'Hahahi_123')

WebUI.setText(findTestObject('Register/confirmpass'), 'Hahahi_123')

WebUI.setText(findTestObject('Register/company'), 'alta')

WebUI.check(findTestObject('Register/NewsLetter'))

WebUI.click(findTestObject('Register/btn_regis'))

WebUI.verifyElementText(findTestObject('Register/Verified'), 'Your registration completed')

WebUI.click(findTestObject('Register/btn_continue'))

