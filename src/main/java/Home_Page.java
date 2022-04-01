import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page extends PageBase {
    public Home_Page(WebDriver driver) {
        super(driver);
    }

  @FindBy(xpath = "//a[@id='visitAmazonAe']")
    WebElement clickAmazonbutton;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searcText;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement serchIcon;

    public void clickOnAmazonButton(){
        clickButton(clickAmazonbutton);
    }
    public void enterSearchText( String searchtext){
        setTextElmentText(searcText , searchtext);

    }
    public void clickSearchicon(){
        clickButton(serchIcon);
    }



}
