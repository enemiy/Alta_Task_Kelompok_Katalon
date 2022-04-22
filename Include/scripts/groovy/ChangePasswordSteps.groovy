import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ChangePasswordSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User navigate to myaccount page")
	def navigateToMyAccount() {
		WebUI.navigateToUrl('https://services.smartbear.com/samples/TestComplete15/smartstore/')
		WebUI.click(findTestObject('ChangePassword/more_ico'))
		WebUI.click(findTestObject('ChangePassword/menu_myaccount'))
	}

	@When("User click change password menu")
	def clickChangePasswordMenu() {
		WebUI.click(findTestObject('ChangePassword/menu_changepassword'))
	}

	@And("User enter old password (.*)")
	def enterOldPassword(String oldpassword) {
		WebUI.setText(findTestObject('ChangePassword/input_OldPassword'), oldpassword)
	}

	@And("User enter new password (.*)")
	def enterNewPassword(String newpassword) {
		WebUI.setText(findTestObject('ChangePassword/input_NewPassword'), newpassword)
	}

	@And("User enter confirm password (.*)")
	def enterConfirmPassword(String confirmpassword) {
		WebUI.setText(findTestObject('ChangePassword/input_ConfirmPassword'), confirmpassword)
	}

	@And("Click on change password button")
	def clickChangePasswordButton(){
		WebUI.click(findTestObject('ChangePassword/button_ChangePassword'))
	}

	@Then("User can see password changed message")
	def verifyMessage() {
		WebUI.verifyElementText(findTestObject('ChangePassword/info_PasswordWasChanged'), 'Password was changed')
	}
}