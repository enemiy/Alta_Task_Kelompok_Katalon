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



class CompareProduct {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@When("User click item")
	def clickItem() {
		println ("\n I am inside clickItem")

		WebUI.click(findTestObject('Compare Product/ImgCategory_Basketball'))

		WebUI.scrollToElement(findTestObject('Compare Product/txt_Sport Brand Basketball'), 3)

		WebUI.click(findTestObject('Compare Product/txt_Sport Brand Basketball'))

		WebUI.scrollToElement(findTestObject('Compare Product/btn_Compare Product'), 3)
	}

	@And("Click on compare button")
	def clickCompareProduct() {
		println ("\n I am inside clickCompareProduct")


		WebUI.click(findTestObject('Compare Product/btn_Compare Product'))

		WebUI.click(findTestObject('Compare Product/btn_CompareNow'))
	}

	@Then("User is navigated to compare product")
	def verifyCompareProduct() {
		println ("\n I am inside verifyCompareProduct")

		WebUI.verifyElementText(findTestObject('Compare Product/verify_CompareProduct'), 'Compare products')
		WebUI.click(findTestObject('Add To Cart/Back_Dashboard'))
	}
}