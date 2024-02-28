package helper

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login1 {

	@Keyword
	def login() {
		def testData = TestDataFactory.findTestData('Data Files/loginData')
		def userName = testData.getValue('username', 1)
		def password = testData.getValue('password', 1)

		WebUI.setText(findTestObject('Object Repository/applitools/Page_ACME Demo App by Applitools/input_Username_username'), userName)
		WebUI.setText(findTestObject('Object Repository/applitools/Page_ACME Demo App by Applitools/input_Password_password'), password)
		WebUI.click(findTestObject('Object Repository/applitools/Page_ACME Demo App by Applitools/a_Sign in'))
	}
}
