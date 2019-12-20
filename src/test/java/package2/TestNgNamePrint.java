package package2;

import org.testng.annotations.*;
public class TestNgNamePrint {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This A");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("This R");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("This U");
    }
    @BeforeMethod 
    public void beforeMethod(){
        System.out.println("This N");
    }
    @Test
    public void Test(){
        System.out.println("This Arun");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("This M");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("This U");
    }
    @AfterMethod 
    public void afterMethod(){
        System.out.println("This K");
    }
    
   
    @AfterSuite
    public void afterSuite(){
        System.out.println("This AR");
    }
}