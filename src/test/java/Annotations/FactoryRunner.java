package Annotations;


import org.testng.annotations.Factory;

public class FactoryRunner {
	
	
	@Factory
	public Object[] factoryDemo() {
	    return new Object[] {
	        new FactoryDemo("Home Page" ), 
	        new FactoryDemo("Login" ),
	        new FactoryDemo("Check out"),
	        new FactoryDemo("Go live"),
	        new FactoryDemo("Corner")
	    };
	}
}
		
	
	


