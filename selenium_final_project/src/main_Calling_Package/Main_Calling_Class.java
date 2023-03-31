package main_Calling_Package;

import org.testng.annotations.Test;


import firstName.*;
import lastName.*;
import gender.*;
import address.*;
import eMail.*;
import datePicker.*;
import setTime.*;
import mobile.*;
import course.*;
import query.*;
import submit.*;
import verificationCode.*;


public class Main_Calling_Class {
  @Test
  public void main_calling_method() {
	  
	  TestCasesClassfirstName ftName = new TestCasesClassfirstName();
	  ftName.ftNamecorrectTest();
	  
	  TestCasesClasslastName ltName = new TestCasesClasslastName();
	  ltName.ltNamecorrectTest();
	  
	  TestCasesClassgenger gender = new TestCasesClassgenger();
	  gender.genderTest();
	  
	  TestCasesClassAddress address = new TestCasesClassAddress();
	  address.StreetAddress();
	  
	  TestCasesClasseMail eMail = new TestCasesClasseMail();
	  eMail.correcteMail();
	  eMail.incorrecteMail1();
	  eMail.incorrecteMail2();
	  eMail.incorrecteMail3();
	  
	  TestCasesClassdatePicker datePicker = new TestCasesClassdatePicker();
	  datePicker.dodByClick();
	  datePicker.dodByText();
	  
	  TestCasesClasssetTime setTime = new TestCasesClasssetTime();
	  setTime.setTimeByClick();
	  setTime.correctsetTimeByText();
	  setTime.incorrectsetTimeByTextHr();
	  setTime.incorrectsetTimeByTextMin();
	  
	  TestCasesClassmobile mobile = new TestCasesClassmobile();
	  mobile.correctmobileTest();
	  mobile.incorrectMobileTest1();
	  mobile.incorrectMobileTest2();
	  mobile.incorrectMobileTest3();
	  mobile.incorrectMobileTest4();
	  
	  TestCasesClassCourse course = new TestCasesClassCourse();
	  course.courseTest();
	  
	  TestCasesClassquery query = new TestCasesClassquery();
	  query.queryTest();
	  
	  TestCasesClassverificationCode verification = new TestCasesClassverificationCode();
	  verification.verificationCodeTest();
	  verification.correctverificationCodeTest();
	  verification.incorrectverificationCodeTest();
	  
	  TestCasesClasssubmit submit = new TestCasesClasssubmit();
	  submit.SubmitTest();
	  submit.correctSubmitTest();
	  submit.ftNamesubmitTest();
	  submit.ltNamesubmitTest();
	  submit.gendersubmitTest();
	  submit.eMailsubmitTest();
	  submit.verificationsubmitTest();
	  submit.VerificationFailSubmitTest();
	  
	  
	  
  }
}
