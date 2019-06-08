package uitesting.upb.org.managepage.nasa.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;


public class Home extends BasePage {

    //@FindBy(css = "")
    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li")
    private WebElement searchButton;



//    public Home searchText(String text){
//        Events.fillField(searchTextField, text);
//        return this;
//    }

    public void clickSearchButton(){
        Events.click(searchButton);
    }



//    public void searchTextAndClickSearchButton(String text){
//        searchText(text).clickSearchButton();
//    }
}
