package Annotations;

import org.testng.annotations.Test;

public class Dataproviderdemo {

    @Test(dataProvider = "logindata")
    public void loginTest(String firstname, String lastname,String location) {
        System.out.println("This is a Test Method ");
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        System.out.println("Location: " + location);
    }
     
    
    @org.testng.annotations.DataProvider(name = "logindata")
    public Object[][] dataproviderMethod() {
        return new Object[][] {
            {"Arun", "kumar","New York"},
            {"Ram", "Prasas", "Cheenai"},
            {"Alok", "Singh", "West Indies"}
        };
    }
}



