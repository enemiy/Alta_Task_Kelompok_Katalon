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



class WriteReviewSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Navigate watches category")
	def clickWatchesCategory() {

		WebUI.click(findTestObject('Object_Write_a_Review/watches_category'))
	}

	@When("User click select product watches")
	def selectProductWatches() {

		WebUI.click(findTestObject('Object_Write_a_Review/select_watches_1'))
	}

	@And("Click tab review")
	def clickTabReview() {
		WebUI.click(findTestObject('Object_Write_a_Review/tab_review'))
	}

	@And("Click write review")
	def clickWriteReview() {
		WebUI.click(findTestObject('Object_Write_a_Review/write_review'))
	}

	@And("I input review product watches")
	def inputReviewProduct() {
		WebUI.click(findTestObject('Object_Write_a_Review/select_rating'))
		WebUI.setText(findTestObject('Object_Write_a_Review/fill_headline_review'), 'Nice Product')
		WebUI.setText(findTestObject('Object_Write_a_Review/fill_review_watches'), 'Good Quality, Fast Order')
	}

	@And("Click submit review")
	def clickSubmitReview() {
		WebUI.click(findTestObject('Object_Write_a_Review/btn_submit_review'))
	}


	@Then("User has write review product")
	def userWriteReview() {
		WebUI.verifyElementPresent(findTestObject('Object_Write_a_Review/verify_product_review'), 3)
	}
}