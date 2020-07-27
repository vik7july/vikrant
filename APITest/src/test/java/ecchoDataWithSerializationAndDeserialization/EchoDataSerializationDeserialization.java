package ecchoDataWithSerializationAndDeserialization;

import org.testng.annotations.Test;
import io.restAssured.http.ContentType;
import testit.EchoData;
import static org.hamcrest.Matchers.*;
import static io.restAssured.RestAssured.*;

public class EchoDataSerializationDeserialization {
	
	@Test(priority=1)
	public void createNewData(){
		EchoData data = new EchoData();
		data.setFoo1("bar1");
		data.setFoo2("bar2");
		given().contentType(contentType.JSON).body(data).when().post("https://postman-echo.com/post");
		.then().statusCode(200).log().all().assertThat().header("host",equalTo("postman-echo.com"));
		
			
		}
	@Test(priority=2){
		public void getEchoDataDeserialization(){
			EchoData data1 = get("https://postman-echo.com/get?foo1=bar1&foo2=bar2").as(EchoData.class);
			Assert.assertequals(data1.getFoo1(), "bar1");
			Assert.assertequals(data1.getFoo2(), "bar2");
			System.out.println(data1.getFoo2());
			System.out.println(data1.getFoo1());
			
		}
	}

}
