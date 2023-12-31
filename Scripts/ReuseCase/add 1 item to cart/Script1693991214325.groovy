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

WebUI.callTestCase(findTestCase('ReuseCase/User Already Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Be a Profressional Talent with Coding.ID/a_Events'))

WebUI.click(findTestObject('Page_Online event bersertifikat dari prakti_f42b96/div_Day 3 Predict using Machine Learning   _e04a14'))

WebUI.click(findTestObject('Object Repository/Page_Day 3 Predict using Machine Learning - Ziyad/a_Beli Tiket'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Day 3 Predict using Machine Learning/a_eventLebih'))

WebUI.click(findTestObject('Page_Online event bersertifikat dari praktisi di bidangnya/div_Day 4 Workshop'))

WebUI.click(findTestObject('Page_Day 4 Workshop - Ziyad/a_Beli Tiket'))

WebUI.verifyElementPresent(findTestObject('Page_Day 3 Predict using Machine Learning - Ziyad/a_eventLebih'), 0)

WebUI.closeBrowser()

