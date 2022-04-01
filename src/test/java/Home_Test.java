import org.testng.annotations.Test;

public class Home_Test extends TestBase_Test{

    Home_Page homepage;

    @Test
    public void searchForIphone(){
        homepage=new Home_Page(driver);
        homepage.clickOnAmazonButton();
        homepage.enterSearchText("iPhone 12 Pro Max");
        homepage.clickSearchicon();
    }




}
