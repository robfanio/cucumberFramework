package TestRun;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType; 
import io.restassured.response.Response; 
import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.response.Response;

public class ApiTest {
  @Test
  public void f() {
	  //How to receive response on get method
	  Response it =get("https://reqres.in/api/users?page=2");
	  it.prettyPrint();
	  System.out.println(it.getStatusCode());
	  System.out.println(it.getTime());
	  
  }
  
  @Test 
  public void f3() {
	  File entry = new File("C:\\Users\\robfa\\Desktop\\cucumber Framework\\Trainingsession\\Entry.json");
	  Response it = given().contentType(ContentType.JSON).body(entry).post("https://reqres.in/api/users");
	  it.prettyPrint();
	  System.out.println(it.getStatusCode());
	  System.out.println(it.getTime());
	  int statusNo = it.getStatusCode();
	  Assert.assertEquals(statusNo,201);
	  //System.out.println(statusNo);
  }
}
