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

WebUI.callTestCase(findTestCase('TC_Login/TC01_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object_Write_a_Review/watches_category'))

WebUI.click(findTestObject('Object_Write_a_Review/select_watches_1'))

WebUI.click(findTestObject('Object_Write_a_Review/tab_review'))

WebUI.click(findTestObject('Object_Write_a_Review/write_review'))

WebUI.click(findTestObject('Object_Write_a_Review/select_rating'))

WebUI.setText(findTestObject('Object_Write_a_Review/fill_headline_review'), 'Nice Product')

WebUI.setText(findTestObject('Object_Write_a_Review/fill_review_watches'), 'Good Quality, Fast Order')

WebUI.click(findTestObject('Object_Write_a_Review/btn_submit_review'))

WebUI.verifyElementPresent(findTestObject('Object_Write_a_Review/verify_product_review'), 3)

WebUI.click(findTestObject('Object_Homepage/icon_homepage'))

