
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class t {
	FirefoxDriver driver;
	
    public static void main( String[] args )
    {
        System.out.println((System.getProperty("user.dir")+"\\testng.xml"));
        List<String> suites = new ArrayList<String>();
        suites.add(System.getProperty("user.dir")+"\\testng.xml");
        TestNG tng = new TestNG();
        tng.setTestSuites(suites);
        tng.run(); 
    }
    
  @Test
  public void f() {
	  System.out.println("wangli test3");
	  driver=new FirefoxDriver();
	  driver.get("http://www.baidu.com");
	  thread.sleep(50000);
  }
}
