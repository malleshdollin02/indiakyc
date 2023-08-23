package automationtest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class test {
	
	
		
		@Test
		public static void getResponseBody(){
			   given().when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
			  .all();
			 
			}


}

