package Annotations;


import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "logindata", dataProviderClass = Dataproviderdemo.class)
    public void loginTest(String username, String password) {
        System.out.println("This is a Test Method ");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @Test(dataProvider = "logindata",dataProviderClass = Dataproviderdemo.class)
    public Object[][] dataproviderMethod() {
        return new Object[][] {
            {"user1", "Password1"},
            {"user2", "Password2"}
        };
    }
}
	
		
		
	
	
	

