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

CucumberKW.runFeatureFile('Include/features/login.feature')

CucumberKW.runFeatureFile('Include/features/search.feature')

CucumberKW.runFeatureFile('Include/features/detailProduct.feature')

CucumberKW.runFeatureFile('Include/features/AddWishList.feature')

CucumberKW.runFeatureFile('Include/features/EmailYourFriend.feature')

CucumberKW.runFeatureFile('Include/features/DeleteWishlist.feature')

CucumberKW.runFeatureFile('Include/features/AddToCart - Copy.feature')

CucumberKW.runFeatureFile('Include/features/CompareProduct - Copy.feature')

CucumberKW.runFeatureFile('Include/features/Checkout - Copy.feature')

CucumberKW.runFeatureFile('Include/features/ContactUs - Copy.feature')

CucumberKW.runFeatureFile('Include/features/Subscribe - Copy.feature')

CucumberKW.runFeatureFile('Include/features/Unsubscribe - Copy.feature')

CucumberKW.runFeatureFile('Include/features/FilterPrice - Copy.feature')

CucumberKW.runFeatureFile('Include/features/WriteReview.feature')

CucumberKW.runFeatureFile('Include/features/AddNewAddress.feature')

CucumberKW.runFeatureFile('Include/features/EditProfile - Copy.feature')

CucumberKW.runFeatureFile('Include/features/ChangePassword.feature')

