package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class LearnDataProviders {

	@Test(dataProvider="getData")
	public void mytest(String firstName, String lastName) {
		System.out.println("I am in mytest ");
		System.out.println(firstName +":"+lastName);
	}
	
	
	@DataProvider
	public Object[][] getData() {
		Faker faker = new Faker();
		Object [][] data= new Object[2][2];
		data[0][0]= faker.name().firstName();
		data[0][1]= faker.name().lastName();
		data[1][0]= faker.address().cityName();
		data[1][1]= faker.address().country();
		
		return data;
	
	}
}
