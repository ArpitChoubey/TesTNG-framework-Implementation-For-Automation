package Annotations;

import org.testng.annotations.Test;

public class DataProviderExamples {
	
	//object[]
	
	public void testmethod(String s) {
		System.out.println(s);
		
	}
   @Test(dataProvider = "dataprovider" )
	public Object[]dataprovider(){
		String [] str= new String[] {
				"User1",
				"User2",
				"User3",
				"User4",
				"User5"
				
		};
		return str;
	}
}
