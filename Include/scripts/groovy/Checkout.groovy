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



class Checkout {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("user selects item")
	def selectsItem() {
		println ("\n I am inside selectsItem")

		WebUI.click(findTestObject('Checkout/img_Furniture'))
	}

	@When("User click product")
	def clickProduct() {
		println ("\n I am inside clickProduct")

		WebUI.click(findTestObject('Checkout/txt_Ball Chair'))
	}

	@And("Click on Add To Cart button")
	def clickAddToCart() {
		println ("\n I am inside clickAddToCart")

		WebUI.click(findTestObject('Checkout/btn_AddToCart'))
	}

	@Then("Click on Checkout button")
	def clickCheckout() {
		println ("\n I am inside clickCheckout")

		WebUI.click(findTestObject('Checkout/btn_Checkout'))
		WebUI.click(findTestObject('Add To Cart/Back_Dashboard'))
	}
}