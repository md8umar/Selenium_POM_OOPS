package MyTests;

import com.mypages.Home;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.SeverityLevel;


public class HomePage_Test extends BaseTests{
@Test(priority = 1)
@Severity(SeverityLevel.CRITICAL)
@Description("Wikipedia Test")
@Story("Wikipedia Test title")
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
