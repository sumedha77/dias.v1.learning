package package1;

import org.testng.annotations.*;

public class TestngLearning {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is Before Suite");
    }

    @Test
    public void test(){
        System.out.println(" This is test");
    }

}
