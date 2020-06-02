package MyTests;

import com.mypages.Home;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseTests{
@Test(priority = 1)
public void verifyPageTitle(){
    String title=page.getInstance(Home.class).getHomepagetitle();
    System.out.println(title);
    Assert.assertEquals(title,"Wikipedia");
}
@Test(priority = 2)
    public  void verifyHeadertitle(){
    String header=page.getInstance(Home.class).getPageHeader();
    System.out.println(header);
    Assert.assertEquals(header,"Wikipedia");

}
}
