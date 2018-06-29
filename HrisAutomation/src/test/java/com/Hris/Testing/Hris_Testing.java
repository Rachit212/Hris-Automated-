package com.Hris.Testing;
import com.Hris.Action.Hris_Action;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;






public class Hris_Testing 
{
	
	Hris_Action a=new Hris_Action();
	
	@BeforeTest
   public void load_driver() {
		a.Set_Path();
		  }
	@Test
	public void Step_01_Open_Url() {
		a.Open_Url();
	}

	@Test
	public void Step_02_Open_Log_in_Panel() {
		a.Login_Panel();
	}

	@Test
	public void Step_03_Log_in_with_correct_username_and_password() {
	//	h.Log_in_with_correct_username_and_password();
	}

	@Test
	public void Step_04_Log_In_with_Either_Username_or_Password_Incorrect() {
		
	}

	@Test
	public void Step_05_Log_in_with_Username_and_Blank_password() {
	//	h.Log_in_with_Username_and_Blank_password();
	}

	@Test
	public void Step_06_Log_in_with_Blank_Username_and_Password() {
	//	h.Log_in_with_Blank_Username_and_Password();

	}

	@Test
	public void Step_07_Log_in_with_correct_username_and_password_and_get_value_from_columns() {
		//h.Log_in_with_correct_username_and_password_and_get_value_from_columns();
	}

	@Test
	public void Step_08_Successful_Logout() throws InterruptedException {
		a.Successful_Logout();

	}

	@AfterTest
	public void afterTest() {
		;

	}

}