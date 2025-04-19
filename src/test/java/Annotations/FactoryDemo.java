package Annotations;

import org.testng.annotations.Test;

public class FactoryDemo {
	
	private String str;
	FactoryDemo(String pagename){
		str=pagename;
	
	}
	
	

	



	@Test
	public void sampletest() {
		System.out.println("This is a Sample Test : " +str);
	}
	
	@Test
	public void sampletest2() {
		System.out.println("This is a Sample Testing : " +str);
	}

}
