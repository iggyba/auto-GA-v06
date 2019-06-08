package uitesting.upb.org.managepage.nasa.home.auth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class auth extends BasePage {

    @FindBy(xpath = "//*[@id=\"tocify-header2\"]/ul/li[2]")
    private WebElement searchButton;

    public void clickSearchButton2(){
        Events.click(searchButton);
    }
}
