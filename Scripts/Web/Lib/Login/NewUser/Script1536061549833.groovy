import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Web/Index/Page_MyCircutor/button_Create a new account'))

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Index/Page_MyCircutor/div_Company name'))

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Web/Index/Page_MyCircutor/input_enterpriseName'), 'Opentrends')

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Web/Index/Page_MyCircutor/i_glyphicon glyphicon-menu-dow'))

not_run: WebUI.click(findTestObject('Web/Index/Page_MyCircutor/a_Aerospace'))

WebUI.setText(findTestObject('Web/Index/Page_MyCircutor/input_userName'), 'Prueba1')

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Index/Page_MyCircutor/div_EMAIL'))

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Web/Index/Page_MyCircutor/input_email'), 'agato@opentrends.net')

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Web/Index/Page_MyCircutor/input_city'), 'BArcelona')

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Index/Page_MyCircutor/i_glyphicon glyphicon-menu-dow_1'))

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Index/Page_MyCircutor/a_Head of department'))

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Web/Index/Page_MyCircutor/input_password'), 'OPoca6cPMueeqJUaet3M5g==')

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Web/Index/Page_MyCircutor/input_repeatedPassword'), 'OPoca6cPMueeqJUaet3M5g==')

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Index/Page_MyCircutor/label_I want to receive email'))

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Index/Page_MyCircutor/label_I accept the privacy pol'))

WebUI.callTestCase(findTestCase('Web/Lib/Indice/Delay'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Web/Index/Page_MyCircutor/button_CREATE ACCOUNT'))

